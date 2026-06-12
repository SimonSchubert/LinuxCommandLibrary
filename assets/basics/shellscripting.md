# Shell Scripting

## Script Basics
A shell script is a text file containing commands that the shell executes in sequence. The first line should be a **shebang** that tells the system which interpreter to use.
```#!/bin/bash```
```#!/usr/bin/env [bash](/man/bash)```

Make the script executable and run it.
```[chmod](/man/chmod) +x script.sh```
```./script.sh```

Use **set** options at the top of scripts to catch errors early.
```[set](/man/set) -euo pipefail```

> **-e** exits on the first error, **-u** treats unset variables as errors, **-o pipefail** makes a pipeline fail if any command in it fails.

## Variables
Variable assignment has **no spaces** around the **=** sign. Use double quotes around variable references to prevent word splitting.

| Expression | Description |
|-----|-------------|
| **VAR=value** | Assign a value |
| **VAR=$(command)** | Capture command output (command substitution) |
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

## Quoting
Quoting controls what the shell expands. When in doubt, use double quotes.

| Expression | Description |
|-----|-------------|
| **'text'** | Single quotes: everything is literal |
| **"text"** | Double quotes: $variables and $(commands) are expanded |
| **\$HOME** | Backslash escapes a single character |

> Always quote variable references: **"$VAR"** survives spaces in the value, unquoted **$VAR** gets split into separate words.

## Special Variables
These are set automatically by the shell inside a running script.

| Variable | Description |
|-----|-------------|
| **$0** | Name of the script |
| **$1..$9** | Positional parameters (arguments) |
| **${10}** | Positional parameters beyond 9 |
| **$#** | Number of arguments |
| **$@** | All arguments as separate words |
| `$*` | All arguments as a single string |
| **$?** | Exit status of the last command |
| **$$** | PID of the current shell |
| **$!** | PID of the last background command |
| **$_** | Last argument of the previous command |

> Prefer **"$@"** when passing arguments on to another command: it preserves each argument as a separate word.

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

> Case conversion (**${VAR^^}**, **${VAR,,}**) requires bash 4 or later.

## Conditionals
Use **[[ ]]** for conditionals in bash scripts. It supports pattern and regex matching and is safer than the older **[ ]** form. The spaces inside the brackets are required.
```if [[ -f "file.txt" ]]; then [echo](/man/echo) "exists"; fi```

| Operator | Description |
|-----|-------------|
| **-f file** | True if file exists and is a regular file |
| **-d file** | True if file exists and is a directory |
| **-e file** | True if file exists (any type) |
| **-r file** | True if file is readable |
| **-w file** | True if file is writable |
| **-x file** | True if file is executable |
| **-s file** | True if file exists and is not empty |
| **-z string** | True if string is empty |
| **-n string** | True if string is not empty |
| **==** | String equality (right side is a glob pattern) |
| **!=** | String inequality |
| **=~** | Regex match (inside [[ ]]) |
| **-eq** | Numeric equality |
| **-ne** | Numeric inequality |
| **-lt** | Numeric less than |
| **-le** | Numeric less than or equal |
| **-gt** | Numeric greater than |
| **-ge** | Numeric greater than or equal |

```if [[ "$count" -gt 0 ]]; then [echo](/man/echo) "positive"; elif [[ "$count" -eq 0 ]]; then [echo](/man/echo) "zero"; else [echo](/man/echo) "negative"; fi```
```if [[ "$input" =~ ^[0-9]+$ ]]; then [echo](/man/echo) "is a number"; fi```

The **case** statement matches a value against glob patterns.
```case "$1" in start) [echo](/man/echo) "Starting";; stop) [echo](/man/echo) "Stopping";; *) [echo](/man/echo) "Usage: $0 {start|stop}";; esac```

## Loops
The **for** loop iterates over a list of items.
```for file in *.txt; do [echo](/man/echo) "$file"; done```
```for i in {1..10}; do [echo](/man/echo) "$i"; done```
```for ((i=0; i<10; i++)); do [echo](/man/echo) "$i"; done```

The **while** loop runs as long as the condition is true. This is the safe way to read a file line by line.
```while IFS= [read](/man/read) -r line; do [echo](/man/echo) "$line"; done < file.txt```

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
| **"${arr[@]}"** | All elements, one word each |
| **${#arr[@]}** | Number of elements |
| **${arr[@]:1:2}** | Slice: 2 elements starting at index 1 |
| **arr+=(d e)** | Append elements |
| **${!arr[@]}** | All indices |
| **unset 'arr[1]'** | Remove an element (indices keep a gap) |

Loop over all elements with the array quoted, so elements with spaces stay intact.
```for item in "${arr[@]}"; do [echo](/man/echo) "$item"; done```

Associative arrays (string keys) require explicit declaration.
```declare -A map```
```map[key]="value"```
```[echo](/man/echo) "${map[key]}"```

## Arithmetic
Use **$(( ))** for arithmetic expressions and **(( ))** for arithmetic statements.

| Expression | Description |
|-----|-------------|
| **$((a + b))** | Addition |
| **$((a - b))** | Subtraction |
| `$((a * b))` | Multiplication |
| **$((a / b))** | Integer division |
| **$((a % b))** | Modulo |
| `$((a ** b))` | Exponentiation |
| **$((a++))** | Post-increment |
| **$((++a))** | Pre-increment |
| **((a += 5))** | Arithmetic assignment |

> Shell arithmetic is integer only. Pipe to **bc** for floating point math.

```[echo](/man/echo) "scale=2; 10 / 3" | [bc](/man/bc)```

## Input and Output
Use **read** to get input from the user or from a file.
```[read](/man/read) -p "Enter name: " name```
```[read](/man/read) -s -p "Password: " pass```
```[read](/man/read) -r -a items <<< "a b c"```

Use **printf** for formatted output, it is more portable and predictable than **echo**.
```[printf](/man/printf) "Name: %s, Age: %d\n" "$name" "$age"```

A **here document** passes multi-line text to a command's standard input.
```
[cat](/man/cat) <<EOF
Hello, $USER
Your home is $HOME
EOF
```

Use **<<'EOF'** (quoted) to prevent variable expansion inside the here document.

## Exit Codes and Traps
Every command returns an exit code: **0** means success, anything else means failure. The code of the last command is in **$?**. Use **exit** to set the script's own exit code.
```command || [exit](/man/exit) 1```
```command && [echo](/man/echo) "succeeded"```

Use **trap** to run cleanup code when the script exits or receives a signal. The EXIT trap runs on any exit, including errors.
```tmpfile=$([mktemp](/man/mktemp))```
```[trap](/man/trap) '[rm](/man/rm) -f "$tmpfile"' EXIT```
```[trap](/man/trap) '[echo](/man/echo) "Interrupted"; exit 130' INT TERM```

## Debugging
Check the syntax without executing the script.
```[bash](/man/bash) -n script.sh```

Trace every command as it runs, with variables expanded.
```[bash](/man/bash) -x script.sh```

Turn tracing on and off inside a script.
```[set](/man/set) -x```
```[set](/man/set) +x```

Lint scripts for common mistakes and pitfalls.
```[shellcheck](/man/shellcheck) script.sh```
