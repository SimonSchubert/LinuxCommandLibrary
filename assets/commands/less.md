# TLDR

**View a file**

```less [file]```

**View a file with line numbers**

```less -N [file]```

**Search for a pattern** after opening

```/[pattern]```

**View the output** of a command

```[command] | less```

**Follow a file** as it grows (like tail -f)

```less +F [file]```

**Open a file at a specific line**

```less +[line_number] [file]```

# SYNOPSIS

**less** [_-options_] [_file ..._]

# PARAMETERS

**-N**, **--LINE-NUMBERS**
> Display line numbers at the beginning of each line

**-S**, **--chop-long-lines**
> Chop long lines instead of wrapping

**-i**, **--ignore-case**
> Ignore case in searches (unless pattern has uppercase)

**-I**, **--IGNORE-CASE**
> Ignore case in searches unconditionally

**-F**, **--quit-if-one-screen**
> Exit immediately if entire file fits on first screen

**-R**, **--RAW-CONTROL-CHARS**
> Output raw control characters (preserves colors)

**-X**, **--no-init**
> Don't clear the screen on exit

**-g**, **--hilite-search**
> Highlight only the current match, not all matches

**-n**, **--line-numbers**
> Suppress line numbers (for performance)

**+F**
> Follow mode, scroll forward and wait for more data

**+** _command_
> Run specified command on startup (e.g., +/pattern to search)

**-p** _pattern_
> Start at first occurrence of pattern

**-o** _file_
> Copy input to file (when reading from pipe)

# NAVIGATION

**Space**, **f**, **PgDn**
> Forward one window

**b**, **PgUp**
> Backward one window

**d**, **u**
> Forward/backward half window

**j**, **k** or **Arrow keys**
> Forward/backward one line

**g**, **G**
> Go to beginning/end of file

**/** _pattern_
> Search forward for pattern

**?** _pattern_
> Search backward for pattern

**n**, **N**
> Repeat search forward/backward

**q**
> Quit

**h**
> Display help

# DESCRIPTION

**less** is a terminal pager program used to view the contents of text files one screen at a time. Unlike **more**, it allows backward navigation through files and does not require reading the entire file before displaying, making it efficient for large files.

The program provides powerful search capabilities with regular expression support, can display line numbers, and handles multiple files in a single session. It is commonly used as the default pager for manual pages and is invaluable for examining log files and command output.

Less can read from standard input, making it ideal for piping command output. The follow mode (+F) allows real-time monitoring of growing files, similar to **tail -f** but with the full navigation capabilities of less.

# CAVEATS

Binary files may display incorrectly or cause terminal issues. Very long lines can be slow to render without the **-S** option. The LESSOPEN and LESSCLOSE environment variables can preprocess files but may pose security risks if not properly configured.

# HISTORY

**less** was written by **Mark Nudelman** and first released in **1984** as an improved replacement for the Unix **more** command. The name is a play on the phrase "less is more." It has become a standard utility on Unix-like systems and is the default pager on most Linux distributions. The program continues to be actively maintained with regular updates adding new features and improvements.

# SEE ALSO

[more](/man/more)(1), [cat](/man/cat)(1), [tail](/man/tail)(1), [head](/man/head)(1), [most](/man/most)(1)
