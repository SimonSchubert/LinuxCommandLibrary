# TAGLINE

CLI typing game with source code challenges

# TLDR

**Start** a typing challenge

```gittype```

**Practice** with specific language

```gittype --lang rust```

**Set** difficulty level

```gittype --difficulty hard```

**View** statistics

```gittype --stats```

# SYNOPSIS

**gittype** [_options_]

# PARAMETERS

**--lang** _LANGUAGE_
> Programming language: rust, python, go, javascript, etc.

**--difficulty** _LEVEL_
> Difficulty: easy, medium, hard

**--duration** _SECONDS_
> Set challenge duration

**--stats**
> Show typing statistics

**--list-langs**
> List available languages

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gittype** is a typing practice game that uses real source code from open source repositories as typing challenges. It helps programmers practice typing code with proper syntax and special characters.

The tool fetches code snippets from GitHub and presents them as typing exercises, tracking speed (WPM) and accuracy.

# CAVEATS

Requires internet connection to fetch code snippets. Code snippets may vary in complexity. Not suitable for learning actual programming concepts.

# HISTORY

**gittype** was created as a fun way for developers to practice typing code with real-world examples instead of generic text.

# SEE ALSO

[typespeed](https://github.com/typeracer/typespeed), [ttyper](https://github.com/max-niederman/ttyper), [monkeytype](https://monkeytype.com/)