package com.nusiss.commonservice.feign;

import com.nusiss.commonservice.config.ApiResponse;
import com.nusiss.commonservice.entity.Permission;
import com.nusiss.commonservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@FeignClient(name = "user-service")
public interface UserFeignClient {

    @GetMapping("/api/user/{id}")
    ResponseEntity<ApiResponse<User>> getUserById(@PathVariable("id") Integer id);


    @RequestMapping(value = "/getCurrentUserInfo", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<User>> getCurrentUserInfo(@RequestHeader("Authorization") String authToken);

    @PostMapping("/api/redis/{key}/{value}/{timeout}")
    public String save(@PathVariable("key") String key, @PathVariable("value") String value, @PathVariable("timeout") Integer timeout);

    // Get value by key
    @GetMapping("/api/redis/{key}")
    public String get(@PathVariable("key") String key);

    // Delete a key
    @DeleteMapping("/api/redis/{key}")
    public String delete(@PathVariable("key") String key);

    // Check if key exists
    @GetMapping("/api/redis/exists/{key}")
    public String exists(@PathVariable("key") String key);

    @GetMapping("/api/roles/userId/{userId}")
    public ResponseEntity<ApiResponse<Integer>> getRoleByUserId(@PathVariable("userId") Integer userId);

    @GetMapping("/api/permissions/findPermissionsByUserId")
    public ResponseEntity<Set<String>> findPermissionsByUserId(@RequestParam("userId") Integer userId);

    @RequestMapping(
            value = "/getCurrentUserInfoWithTokenString",
            method = RequestMethod.GET
    )
    public ResponseEntity<ApiResponse<User>> getCurrentUserInfoWithTokenString(
            @RequestParam("authToken") String authToken
    );

    @PostMapping("/api/permissions")
    public ResponseEntity<ApiResponse<Permission>> createPermission(@RequestBody Permission p);

    /*@GetMapping("/{name}")
    public ResponseEntity<ApiResponse<User>> findByUsername(@PathVariable String name);
*/

}
