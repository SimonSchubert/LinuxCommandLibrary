# JSON

## Pretty print
```[echo](/man/echo) '{"name": "Linux"}' | [fx](/man/fx) .```
```[echo](/man/echo) '{"name": "Linux"}' | [dasel](/man/dasel) -r json```
```[echo](/man/echo) '{"name": "Linux"}' | [jq](/man/jq) "."```
```[echo](/man/echo) '{"name": "Linux"}' | [jshon](/man/jshon)```
```[echo](/man/echo) '{"name": "Linux"}' | [jql](/man/jql) '.'```
```[echo](/man/echo) '{"name": "Linux"}' | [emuto](/man/emuto)```

## Select
```[echo](/man/echo) '{"name": "Linux"}' | [dasel](/man/dasel) -r json '.name'```
```[echo](/man/echo) '{"name": "Linux"}' | [fx](/man/fx) .name```
```[echo](/man/echo) '{"name": "Linux"}' | [jq](/man/jq) ".name"```
```[echo](/man/echo) '{"name": "Linux"}' | [jshon](/man/jshon) -e name```
```[echo](/man/echo) '{"name": "Linux"}' | [jql](/man/jql) '.name'```
```[echo](/man/echo) '{"name": "Linux"}' | [emuto](/man/emuto) "$.name"```

## Put
```[echo](/man/echo) '{"name": "Linux"}' | [dasel](/man/dasel) put string -r json '.year' '1991'```
```[echo](/man/echo) '{"name": "Linux"}' | [jshon](/man/jshon) -s 1991 -i year```
```[echo](/man/echo) '{"name": "Linux"}' | [emuto](/man/emuto) "{'name': $.name,'year':1991}"```

## Delete
```[echo](/man/echo) '{"name": "Linux", "year": 1991}' | [dasel](/man/dasel) delete -r json '.year'```
```[echo](/man/echo) '{"name": "Linux", "year": 1991}' | [jshon](/man/jshon) -d year```
```[echo](/man/echo) '{"name": "Linux", "year": 1991}' | [emuto](/man/emuto) "{'name': $.name}"```

## Create
```[jo](/man/jo) -p name=Linux year=1991```
