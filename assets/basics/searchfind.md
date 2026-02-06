# Search & Find

## Find a file by name
```[find](/man/find) / -iname "[query]"```
```[fd](/man/fd) [query]```
```[fzf](/man/fzf)```

## Find all path names containing a phrase
```[locate](/man/locate) [query]```
```[plocate](/man/plocate) [query]```

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

## Find all files accessed 7 days ago
```[find](/man/find) / -atime 7```

## Search for pattern in file
```[grep](/man/grep) [query] [file]```
```[rg](/man/rg) [query] [file]```
```[ag](/man/ag) [query] [file]```

## Find files between 10MB and 100MB
```[find](/man/find) / -size +10M -size -100M```

## Find files by extension
```[fd](/man/fd) -e [extension]```
```[find](/man/find) . -type f -name "*.[extension]"```
```[locate](/man/locate) "*.[extension]"```

## Search recursively in files
```[grep](/man/grep) -r [query] [path]```
```[rg](/man/rg) [query] [path]```
```[ag](/man/ag) [query] [path]```

## Find empty files and directories
```[find](/man/find) / -type f -empty```
```[find](/man/find) / -type d -empty```
