# TAGLINE

Terminal UI for regex testing

# TLDR

**Pipe text and interactively test regex patterns**

```echo "hello world 123" | rexi```

**Test patterns against a file**

```cat [logfile.txt] | rexi```

# SYNOPSIS

_command_ | **rexi**

# DESCRIPTION

**rexi** is an interactive terminal UI for testing regular expressions. It reads input from stdin and lets you evaluate regex patterns in real-time using either match or finditer modes, providing instant visual feedback on matches.

# HISTORY

**rexi** was created by **Roy Reznik** (royreznik) and is written in **Python** using the Textual library.

# SEE ALSO

[grep](/man/grep)(1), [ripgrep](/man/ripgrep)(1), [sad](/man/sad)(1)
