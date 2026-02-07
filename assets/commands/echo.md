# TAGLINE

display text output

# TLDR

**Print** text

```echo ["Hello World"]```

**Without** newline

```echo -n ["text"]```

**Interpret** escape sequences

```echo -e ["Line 1\nLine 2"]```

**Write** to file

```echo ["content"] > [file.txt]```

**Append** to file

```echo ["more content"] >> [file.txt]```

# SYNOPSIS

**echo** [_options_] [_string_...]

# DESCRIPTION

**echo** displays a line of text to standard output. It's one of the most basic and frequently used commands, essential for scripts, logging, and displaying information to users.

The command exists as both a shell built-in and standalone program.

# PARAMETERS

**-n**
> Don't output trailing newline

**-e**
> Enable interpretation of backslash escapes

**-E**
> Disable interpretation of backslash escapes (default)

# ESCAPE SEQUENCES

(With **-e** flag):

**\n** - Newline
**\t** - Tab
**\r** - Carriage return
**\a** - Alert (bell)
**\b** - Backspace
**\\\\** - Backslash
**\\"** - Double quote
**\xHH** - Hexadecimal byte
**\0NNN** - Octal byte

# WORKFLOW

```bash
# Simple output
echo "Hello World"

# Multiple arguments
echo Hello World  # Same as above

# Variables
name="Alice"
echo "Hello, $name"

# Without newline
echo -n "Enter name: "
read name

# Escape sequences
echo -e "Line 1\nLine 2\nLine 3"
echo -e "Name:\tJohn"

# Write to file
echo "log entry" > log.txt

# Append
echo "another entry" >> log.txt

# Empty line
echo

# Special characters
echo "Price: \$100"
```

# REDIRECTION

```bash
# Overwrite file
echo "new content" > file.txt

# Append
echo "more content" >> file.txt

# To stderr
echo "error" >&2

# Discard output
echo "hidden" > /dev/null
```

# COMMON USES

**Scripts:**
```bash
echo "Starting backup..."
backup_files
echo "Backup complete"
```

**Environment:**
```bash
echo $PATH
echo $HOME
echo $USER
```

**Create files:**
```bash
echo "#!/bin/bash" > script.sh
echo "echo 'Hello'" >> script.sh
chmod +x script.sh
```

**Debugging:**
```bash
echo "DEBUG: variable=$variable"
echo "Here: $(pwd)"
```

# SHELL BUILT-IN VS EXTERNAL

Most shells have echo as a built-in, which may behave differently than /bin/echo. Behavior varies between shells (bash, zsh, sh).

# CAVEATS

Behavior differs between shells. -e and -E support varies. Backslash interpretation inconsistent. Prefer printf for portable scripts. Variable expansion happens before echo runs. Quotes affect word splitting.

# HISTORY

**echo** has been part of Unix since Version 2 in **1972**, though its behavior has varied across different Unix variants.

# SEE ALSO

[printf](/man/printf)(1), [cat](/man/cat)(1), [tee](/man/tee)(1)
