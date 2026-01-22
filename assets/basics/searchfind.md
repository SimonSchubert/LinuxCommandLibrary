# Search & Find

## Find a file by name
```[find](/man/find) / -iname "[query]"```
```[fd](/man/fd) [query]```

## Find all path names containing a phrase
```[locate](/man/locate) [query]```

## Find the path of an executable
```[which](/man/which) [command]```

## Find location of binary/source/man files for a command
```[whereis](/man/whereis) [command]```

## Search for pattern in output of command
```[history](/man/history) | [grep](/man/grep) [phrase]```

## Find files whose content was modified less than 60 minutes ago
```[find](/man/find) / -mmin -60```

## Find files whose status was changed less than 60 minutes ago
```[find](/man/find) / -cmin -60```

## Find all files which are accessed 7 days back
```[find](/man/find) / -atime 7```

## Search for pattern in file
```[grep](/man/grep) [query] [file]```

## Find all files which are greater than 10MB and less than 100MB
```[find](/man/find) / -size +10M -size -100M```

## Find files by extension
```[fd](/man/fd) -e [extension]```
```[find](/man/find) . -type f -name "*.[extension]"```
```[locate](/man/locate) "*.[extension]"```
