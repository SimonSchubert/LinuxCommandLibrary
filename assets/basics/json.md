# JSON

## Getting Started
**jq** is the standard command-line JSON processor: it reads JSON from a file or stdin, applies a filter, and prints the result. The simplest filter, **.**, just pretty-prints.
```[jq](/man/jq) "." file.json```
```[curl](/man/curl) -s https://api.github.com/users/torvalds | [jq](/man/jq) "."```
```[echo](/man/echo) '{"name": "Linux"}' | [jq](/man/jq) "."```

Alternatives with their own strengths: **jaq** (faster jq clone), **dasel** (also speaks YAML, TOML, XML), **fx** and **jless** (interactive viewers), **gron** (makes JSON greppable), **jo** (creates JSON), **jc** (converts classic command output to JSON).

## Selecting Values
Filters address values by path: **.key** for object fields, **[0]** for array indexes, **[]** to iterate over all elements. **-r** prints strings raw, without quotes.
```[echo](/man/echo) '{"name": "Linux"}' | [jq](/man/jq) ".name"```
```[jq](/man/jq) ".user.address.city" file.json```
```[jq](/man/jq) ".items[0]" file.json```
```[jq](/man/jq) -r ".items[].name" file.json```

The same selection in other tools:
```[echo](/man/echo) '{"name": "Linux"}' | [dasel](/man/dasel) -r json '.name'```
```[echo](/man/echo) '{"name": "Linux"}' | [fx](/man/fx) .name```
```[echo](/man/echo) '{"name": "Linux"}' | [jshon](/man/jshon) -e name```

## Filtering & Transforming
jq filters chain with **|** just like shell pipes. **select()** keeps matching elements, **map()** transforms each one.
```[jq](/man/jq) '.items[] | select(.price > 10)' file.json```
```[jq](/man/jq) '.items | map(.name)' file.json```
```[jq](/man/jq) '.items | length' file.json```
```[jq](/man/jq) 'keys' file.json```
```[jq](/man/jq) '.items | sort_by(.price)' file.json```

Build new objects from existing fields.
```[jq](/man/jq) '.items[] | {title: .name, cost: .price}' file.json```

## Modifying
Set or add a field with **=**, remove one with **del()**. jq never edits in place; redirect the output to a new file.
```[echo](/man/echo) '{"name": "Linux"}' | [jq](/man/jq) '.year = 1991'```
```[echo](/man/echo) '{"name": "Linux", "year": 1991}' | [jq](/man/jq) 'del(.year)'```
```[echo](/man/echo) '{"name": "Linux"}' | [dasel](/man/dasel) put string -r json '.year' '1991'```
```[echo](/man/echo) '{"name": "Linux", "year": 1991}' | [dasel](/man/dasel) delete -r json '.year'```

## Creating
**jo** builds JSON from shell arguments; **jq -n** builds it from a filter alone.
```[jo](/man/jo) -p name=Linux year=1991```
```[jq](/man/jq) -n '{name: "Linux", year: 1991}'```

## Grepping & Exploring
**gron** flattens JSON into discrete assignments so you can use plain **grep**, then reassembles it with **-u**. **jless** and **fx** browse large documents interactively with folding and search.
```[gron](/man/gron) file.json | [grep](/man/grep) "name"```
```[gron](/man/gron) file.json | [grep](/man/grep) "name" | [gron](/man/gron) -u```
```[jless](/man/jless) file.json```
```[fx](/man/fx) file.json```

## Converting
**yq** applies jq-style filters to YAML, and **dasel** converts between formats. **jc** turns the output of classic commands into JSON so you can process it with jq.
```[yq](/man/yq) ".name" config.yaml```
```[dasel](/man/dasel) -r json -w yaml < file.json```
```[jc](/man/jc) ifconfig | [jq](/man/jq) ".[0].ipv4_addr"```

Compact output for machines: **jq -c** prints one line per document, useful for JSON Lines streams.
