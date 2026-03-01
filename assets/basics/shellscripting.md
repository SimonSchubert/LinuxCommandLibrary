# Shell Scripting

## Script Basics
A shell script is a text file containing commands that the shell executes in sequence. The first line should be a **shebang** that tells the system which interpreter to use.
```#!/bin/bash```
```#!/usr/bin/env [bash](/man/bash)```

Make the script executable and run it.
```[chmod](/man/chmod) +x script.sh```
```./script.sh```

Use `set` options at the top of scripts to catch errors early.
```set -euo pipefail```

> **-e** exits on error, **-u** treats unset variables as errors, **-o pipefail** catches failures in pipes.

## Variables
Variable assignment has **no spaces** around the `=` sign. Use double quotes around variable references to prevent word splitting.

| Expression | Description |
|-----|-------------|
| **VAR=value** | Assign a value |
| **$VAR** | Read the value |
| **${VAR}** | Read with explicit boundary |
| **"$VAR"** | Read safely with quoting |
| **${VAR:-default}** | Use default if VAR is unset or empty |
| **${VAR:=default}** | Assign default if VAR is unset or empty |
| **${VAR:+alternate}** | Use alternate if VAR is set and not empty |
| **${VAR:?error msg}** | Exit with error if VAR is unset or empty |
| **${#VAR}** | Length of the value |
| **readonly VAR** | Make variable read-only |
| **export VAR** | Make variable available to child processes |

## Special Variables
These are set automatically by the shell and are read-only.

| Variable | Description |
|-----|-------------|
| **$0** | Name of the script |
| **$1..$9** | Positional parameters (arguments) |
| **${10}** | Positional parameters beyond 9 |
| **$#** | Number of arguments |
| **$@** | All arguments as separate words |
| **$*** | All arguments as a single string |
| **$?** | Exit status of the last command |
| **$$** | PID of the current shell |
| **$!** | PID of the last background command |
| **$_** | Last argument of the previous command |

## String Operations
Bash provides built-in string manipulation without needing external commands.

| Expression | Description |
|-----|-------------|
| **${VAR#pattern}** | Remove shortest match from start |
| **${VAR##pattern}** | Remove longest match from start |
| **${VAR%pattern}** | Remove shortest match from end |
| **${VAR%%pattern}** | Remove longest match from end |
| **${VAR/old/new}** | Replace first occurrence |
| **${VAR//old/new}** | Replace all occurrences |
| **${VAR:offset}** | Substring from offset |
| **${VAR:offset:length}** | Substring from offset with length |
| **${VAR^}** | Uppercase first character |
| **${VAR^^}** | Uppercase all characters |
| **${VAR,}** | Lowercase first character |
| **${VAR,,}** | Lowercase all characters |

## Conditionals
Use `[[ ]]` for conditionals in bash scripts. It supports pattern matching and is safer than the older `[ ]` form. Always put spaces inside the brackets.
```if [[ -f "file.txt" ]]; then [echo](/man/echo) "exists"; fi```

| Operator | Description |
|-----|-------------|
| **-f file** | True if file exists and is a regular file |
| **-d file** | True if file exists and is a directory |
| **-e file** | True if file exists (any type) |
| **-r file** | True if file is readable |
| **-w file** | True if file is writable |
| **-x file** | True if file is executable |
| **-s file** | True if file is not empty |
| **-z string** | True if string is empty |
| **-n string** | True if string is not empty |
| **==** | String equality |
| **!=** | String inequality |
| **=~** | Regex match (inside `[[ ]]`) |
| **-eq** | Numeric equality |
| **-ne** | Numeric inequality |
| **-lt** | Numeric less than |
| **-le** | Numeric less than or equal |
| **-gt** | Numeric greater than |
| **-ge** | Numeric greater than or equal |

```if [[ $count -gt 0 ]]; then [echo](/man/echo) "positive"; elif [[ $count -eq 0 ]]; then [echo](/man/echo) "zero"; else [echo](/man/echo) "negative"; fi```

The **case** statement matches a value against patterns.
```case "$1" in start) [echo](/man/echo) "Starting";; stop) [echo](/man/echo) "Stopping";; *) [echo](/man/echo) "Usage: $0 {start|stop}";; esac```

## Loops
The **for** loop iterates over a list of items.
```for file in *.txt; do [echo](/man/echo) "$file"; done```
```for i in {1..10}; do [echo](/man/echo) "$i"; done```
```for ((i=0; i<10; i++)); do [echo](/man/echo) "$i"; done```

The **while** loop runs as long as the condition is true.
```while [read](/man/read) -r line; do [echo](/man/echo) "$line"; done < file.txt```

The **until** loop runs until the condition becomes true.
```until [[ -f "ready.flag" ]]; do [sleep](/man/sleep) 1; done```

Use **break** to exit a loop early and **continue** to skip to the next iteration.

## Functions
Functions group reusable commands. Arguments are accessed with **$1**, **$2**, etc. inside the function body. Use **local** to keep variables scoped to the function.
```greet() { local name="$1"; [echo](/man/echo) "Hello, $name"; }```
```greet "World"```

A function returns its last command's exit status, or use **return** to set an explicit exit code (0-255). To return strings, use command substitution.
```get_date() { [date](/man/date) +%Y-%m-%d; }```
```today=$(get_date)```

## Arrays
Bash supports indexed arrays. Declare and manipulate them as follows.

| Expression | Description |
|-----|-------------|
| **arr=(a b c)** | Declare an array |
| **arr[0]=value** | Set element by index |
| **${arr[0]}** | Access element by index |
| **${arr[@]}** | All elements |
| **${#arr[@]}** | Number of elements |
| **${arr[@]:1:2}** | Slice: 2 elements starting at index 1 |
| **arr+=(d e)** | Append elements |
| **${!arr[@]}** | All indices |
| **unset arr[1]** | Remove an element |

Associative arrays require explicit declaration.
```declare -A map```
```map[key]="value"```
```[echo](/man/echo) "${map[key]}"```

## Arithmetic
Use `$(( ))` for arithmetic expressions. All standard operators are available.

| Expression | Description |
|-----|-------------|
| **$((a + b))** | Addition |
| **$((a - b))** | Subtraction |
| **$((a * b))** | Multiplication |
| **$((a / b))** | Integer division |
| **$((a % b))** | Modulo |
| **$((a ** b))** | Exponentiation |
| **$((a++))** | Post-increment |
| **$((++a))** | Pre-increment |
| **let "a += 5"** | Arithmetic assignment |

## Input and Output
Use **read** to get input from the user or from a file.
```[read](/man/read) -p "Enter name: " name```
```[read](/man/read) -s -p "Password: " pass```
```[read](/man/read) -r -a items <<< "a b c"```

Use **printf** for formatted output — it is more portable than echo.
```[printf](/man/printf) "Name: %s, Age: %d\n" "$name" "$age"```

A **here document** passes multi-line text to a command.
```[cat](/man/cat) <<EOF```
> Lines of text go here.
> Variables like $HOME are expanded.

```EOF```

Use `<<'EOF'` (quoted) to prevent variable expansion inside the here document.

## Exit Codes and Traps
Every command returns an exit code: **0** means success, anything else means failure. Use **exit** to set the script's return code.
```exit 0```
```exit 1```

Use **trap** to run cleanup code when the script exits or receives a signal.
```trap '[rm](/man/rm) -f /tmp/mylock' EXIT```
```trap '[echo](/man/echo) "Interrupted"' INT TERM```

Combine `set` options for robust scripts.

| Option | Description |
|-----|-------------|
| **set -e** | Exit immediately on error |
| **set -u** | Error on undefined variables |
| **set -o pipefail** | Pipe fails if any command fails |
| **set -x** | Print each command before executing (debug) |
