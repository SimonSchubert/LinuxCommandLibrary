# Text Processing

## Substitute Text
**sed** applies editing commands to each line. The substitute command **s/old/new/** replaces the first match per line; **g** replaces all matches, **I** ignores case. **-i** edits the file in place instead of printing the result.
```[sed](/man/sed) 's/old/new/g' [file]```
```[sed](/man/sed) -i 's/old/new/g' [file]```
```[sed](/man/sed) -i 's/old/new/gI' [file]```

**sd** does the same job with simpler, regex-by-default syntax.
```[sd](/man/sd) "old" "new" [file]```

Any character can delimit the s command: **s|/usr/bin|/usr/local/bin|** avoids escaping slashes in paths.

## Delete or Print Specific Lines
**d** deletes matching lines; **-n** with **p** prints only selected lines. Addresses can be patterns, line numbers, or ranges.
```[sed](/man/sed) '/pattern/d' [file]```
```[sed](/man/sed) -i '/^$/d' [file]```
```[sed](/man/sed) -n '5,10p' [file]```
```[sed](/man/sed) -n '/pattern/p' [file]```

## Extract Fields
**awk** splits every line into fields: **$1** is the first field, **$0** the whole line, **NR** the line number. **-F** changes the field separator from whitespace to anything else.
```[awk](/man/awk) '{print $1}' [file]```
```[awk](/man/awk) -F: '{print $1, $3}' /etc/passwd```
```[awk](/man/awk) '{print NR, $0}' [file]```

**cut** is the lightweight alternative for simple column extraction, by delimiter (**-d**, **-f**) or character position (**-c**).
```[cut](/man/cut) -d: -f1 [file]```
```[cut](/man/cut) -d',' -f1,3 [file]```
```[cut](/man/cut) -c1-10 [file]```

## Filter with Conditions
An awk program is **condition { action }**: lines matching the condition run the action (default: print the line).
```[awk](/man/awk) '$3 > 100' [file]```
```[awk](/man/awk) '/pattern/ {print $2}' [file]```
```[awk](/man/awk) 'NR>=5 && NR<=10' [file]```

Aggregate across lines with variables and an **END** block.
```[awk](/man/awk) '{sum += $1} END {print sum}' [file]```
```[awk](/man/awk) '{sum += $1} END {print sum/NR}' [file]```

## Sort Lines
Alphabetical by default; **-n** sorts numerically, **-r** reverses, **-u** drops duplicates, **-t** and **-k** sort by a specific field. **-h** understands human-readable sizes like 2K and 1G.
```[sort](/man/sort) [file]```
```[sort](/man/sort) -n [file]```
```[sort](/man/sort) -r [file]```
```[sort](/man/sort) -t: -k3 -n [file]```
```[sort](/man/sort) -u [file]```

## Find Duplicate Lines
**uniq** only compares neighboring lines, so sort first. **-c** counts occurrences, **-d** shows only duplicated lines, **-u** only unique ones.
```[sort](/man/sort) [file] | [uniq](/man/uniq)```
```[sort](/man/sort) [file] | [uniq](/man/uniq) -c | [sort](/man/sort) -rn```
```[sort](/man/sort) [file] | [uniq](/man/uniq) -d```

The **sort | uniq -c | sort -rn** pipeline is the classic frequency counter: it ranks every distinct line by how often it occurs.

## Translate or Delete Characters
**tr** maps characters from one set to another, **-d** deletes them, **-s** squeezes repeats into one.
```[tr](/man/tr) 'a-z' 'A-Z' < [file]```
```[tr](/man/tr) -d '[:digit:]' < [file]```
```[tr](/man/tr) -s ' ' < [file]```
```[tr](/man/tr) '\n' ' ' < [file]```

## Compare Files
**diff -u** is the standard patch-style comparison; **-y** shows files side by side; **cmp** compares bytes and is ideal for binary files.
```[diff](/man/diff) -u [file1] [file2]```
```[diff](/man/diff) -y [file1] [file2]```
```[cmp](/man/cmp) [file1] [file2]```

**comm** shows lines unique to each sorted file and lines they share, in three columns. Suppress columns by number.
```[comm](/man/comm) [file1] [file2]```
```[comm](/man/comm) -12 [file1] [file2]```

Both **comm** and **join** require their input files to be sorted.

## Combine Files
**paste** glues files together line by line; **-s** joins all lines of one file into a single line. **join** matches lines from two files on a common field, like a database join.
```[paste](/man/paste) [file1] [file2]```
```[paste](/man/paste) -d',' [file1] [file2]```
```[paste](/man/paste) -s [file]```
```[join](/man/join) [file1] [file2]```
```[join](/man/join) -t: -1 1 -2 3 [file1] [file2]```

## Format Text
Align fields into a table, or wrap long lines. **fmt** rewraps paragraphs intelligently, **fold** cuts hard at the width (**-s** breaks at spaces).
```[column](/man/column) -t [file]```
```[column](/man/column) -t -s',' [file]```
```[fmt](/man/fmt) -w 80 [file]```
```[fold](/man/fold) -s -w 80 [file]```

## Number Lines
**nl** numbers only non-empty lines by default; **-ba** numbers all lines, like **cat -n**.
```[nl](/man/nl) [file]```
```[nl](/man/nl) -ba [file]```
```[cat](/man/cat) -n [file]```

## Count
Lines, words, and bytes; **-m** counts characters in multi-byte encodings.
```[wc](/man/wc) [file]```
```[wc](/man/wc) -l [file]```
```[wc](/man/wc) -w [file]```
```[wc](/man/wc) -c [file]```

## Reverse and Shuffle
**tac** prints a file last line first, **rev** reverses each line's characters, **shuf** randomizes line order.
```[tac](/man/tac) [file]```
```[rev](/man/rev) [file]```
```[shuf](/man/shuf) [file]```
```[shuf](/man/shuf) -n 1 [file]```
