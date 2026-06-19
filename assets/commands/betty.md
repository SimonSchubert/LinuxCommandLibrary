# TAGLINE

Natural language interface for the command line

# TLDR

**Ask Betty a question**

```betty [whats my username]```

**Count words in directory**

```betty [how many words are in this directory]```

**Find files containing text**

```betty [find me all files that contain california]```

**Check current time**

```betty [what time is it]```

**Count lines in file**

```betty [count lines in myfile.txt]```

**Compress files**

```betty [compress this directory]```

**Download file**

```betty [download https://example.com/file.zip]```

# SYNOPSIS

**betty** _natural language query_

# DESCRIPTION

**betty** is a friendly English-like interface for the command line, written in Ruby. It translates natural language phrases into executable commands so you do not have to leave the terminal to look up obscure syntax. When you forget a command, ask Betty in plain English.

Betty displays the command it inferred before running it. If multiple interpretations exist, it presents numbered options and asks you to select the appropriate one, providing learning opportunities along the way.

# CAPABILITIES

**File operations**
> Find, count, compress, decompress files

**System queries**
> Username, real name, IP address, date/time, disk usage

**Process management**
> List, find, kill processes

**Text processing**
> Count words, lines, characters

**Networking**
> Download files, web queries, weather

**Permissions**
> Change file ownership and permissions

**Media control**
> Control iTunes and Spotify (play, pause, next track)

# INSTALLATION

Requires Ruby. Clone the repository and run the installer (or add the alias manually).

```
git clone https://github.com/pickhardt/betty
ruby betty/install.rb
# or, manually:
echo 'alias betty="~/betty/main.rb"' >> ~/.bashrc
source ~/.bashrc
```

# CAVEATS

Requires Ruby runtime. Limited to predefined command patterns. Not suitable for complex or unusual commands.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [cheat](/man/cheat)(1)

# RESOURCES

```[Source code](https://github.com/pickhardt/betty)```

<!-- verified: 2026-06-19 -->
