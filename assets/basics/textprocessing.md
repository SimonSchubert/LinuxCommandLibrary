# Text Processing

## Substitute text in a file
```[sed](/man/sed) 's/old/new/g' [file]```
```[sed](/man/sed) -i 's/old/new/g' [file]```
```[sed](/man/sed) -i 's/old/new/gI' [file]```

## Delete lines matching a pattern
```[sed](/man/sed) '/pattern/d' [file]```
```[sed](/man/sed) -i '/^$/d' [file]```

## Print specific lines
```[sed](/man/sed) -n '5,10p' [file]```
```[sed](/man/sed) -n '/pattern/p' [file]```

## Extract fields from text
```[awk](/man/awk) '{print $1}' [file]```
```[awk](/man/awk) -F: '{print $1, $3}' [file]```
```[awk](/man/awk) '{print NR, $0}' [file]```

## Filter lines with awk conditions
```[awk](/man/awk) '$3 > 100' [file]```
```[awk](/man/awk) '/pattern/ {print $2}' [file]```
```[awk](/man/awk) 'NR>=5 && NR<=10' [file]```

## Sum a column of numbers
```[awk](/man/awk) '{sum += $1} END {print sum}' [file]```

## Sort lines
```[sort](/man/sort) [file]```
```[sort](/man/sort) -n [file]```
```[sort](/man/sort) -r [file]```
```[sort](/man/sort) -t: -k3 -n [file]```
```[sort](/man/sort) -u [file]```

## Filter duplicate lines
```[uniq](/man/uniq) [file]```
```[uniq](/man/uniq) -c [file]```
```[uniq](/man/uniq) -d [file]```
```[uniq](/man/uniq) -u [file]```
```[sort](/man/sort) [file] | [uniq](/man/uniq) -c | [sort](/man/sort) -rn```

## Cut fields from text
```[cut](/man/cut) -d: -f1 [file]```
```[cut](/man/cut) -d',' -f1,3 [file]```
```[cut](/man/cut) -c1-10 [file]```

## Translate or delete characters
```[tr](/man/tr) 'a-z' 'A-Z' < [file]```
```[tr](/man/tr) -d '[:digit:]' < [file]```
```[tr](/man/tr) -s ' ' < [file]```
```[tr](/man/tr) '\n' ' ' < [file]```

## Compare two files
```[diff](/man/diff) [file1] [file2]```
```[diff](/man/diff) -u [file1] [file2]```
```[diff](/man/diff) -y [file1] [file2]```
```[comm](/man/comm) [file1] [file2]```
```[cmp](/man/cmp) [file1] [file2]```

## Merge lines of files
```[paste](/man/paste) [file1] [file2]```
```[paste](/man/paste) -d',' [file1] [file2]```
```[paste](/man/paste) -s [file]```

## Join files on a common field
```[join](/man/join) [file1] [file2]```
```[join](/man/join) -t: -1 1 -2 3 [file1] [file2]```

## Format text into columns
```[column](/man/column) -t [file]```
```[column](/man/column) -t -s',' [file]```

## Wrap text to a specific width
```[fmt](/man/fmt) -w 80 [file]```
```[fold](/man/fold) -w 80 [file]```
```[fold](/man/fold) -s -w 80 [file]```

## Number lines
```[nl](/man/nl) [file]```
```[nl](/man/nl) -ba [file]```
```[cat](/man/cat) -n [file]```

## Count lines, words, and characters
```[wc](/man/wc) [file]```
```[wc](/man/wc) -l [file]```
```[wc](/man/wc) -w [file]```
```[wc](/man/wc) -c [file]```
