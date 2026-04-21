# TAGLINE

Terminal UI for regex testing

# TLDR

**Pipe text and interactively test regex patterns**

```echo "hello world 123" | rexi```

**Test patterns against a file**

```cat [logfile.txt] | rexi```

**Test patterns against command output**

```ls -la | rexi```

**Install via pip**

```pip install rexi```

# SYNOPSIS

_command_ | **rexi**

# DESCRIPTION

**rexi** is an interactive terminal UI for testing regular expressions. It reads input from stdin and lets you evaluate regex patterns in real-time, providing instant visual feedback as matches are highlighted.

It supports two evaluation modes:

- **match**: uses Python's `re.match` / `re.search` semantics.
- **finditer**: uses `re.finditer` to iterate all non-overlapping matches.

# CAVEATS

**rexi** requires input on standard input; it does not accept file arguments directly. Regex syntax follows the **Python `re`** module rather than PCRE or POSIX.

# HISTORY

**rexi** was created by **Roy Reznik** (royreznik) and is written in **Python** using the Textual TUI framework.

# SEE ALSO

[grep](/man/grep)(1), [ripgrep](/man/ripgrep)(1)
