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

**betty** is a friendly English-like interface for the command line. It translates natural language phrases into executable Linux commands. When you forget a command, ask Betty in plain English.

If multiple interpretations exist, Betty will ask you to select the appropriate one. Betty also displays the actual commands it executes, providing learning opportunities.

# CAPABILITIES

**File operations**
> Find, count, compress, decompress files

**System queries**
> Username, date/time, disk usage

**Process management**
> List, find, kill processes

**Text processing**
> Count words, lines, characters

**Networking**
> Download files, web queries

**Permissions**
> Change file permissions

# INSTALLATION

Requires Ruby, Curl, and Git.

```
git clone https://github.com/pickhardt/betty
echo 'alias betty="~/betty/main.rb"' >> ~/.bashrc
source ~/.bashrc
```

# CAVEATS

Requires Ruby runtime. Limited to predefined command patterns. Not suitable for complex or unusual commands.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [cheat](/man/cheat)(1)
