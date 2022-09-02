#Keycloak Get Token
template
```
curl -X POST "{token_endpoint path}" \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'client_id={client_id}' \
--data-urlencode 'client_secret={client_secrest}' \
--data-urlencode 'username={user_name}' \
--data-urlencode 'password={password}' 
```
---
example
```
curl -X POST "http://localhost:8080/realms/test_sample_realm/protocol/openid-connect/token" \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'client_id=test_sample_client' \
--data-urlencode 'client_secret=Yo8vGtUWRwrWjzzW3FzHO10KaMBkh5Jx' \
--data-urlencode 'username=admin' \
--data-urlencode 'password=admin' 
```
