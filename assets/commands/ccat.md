# TLDR

**Display file with syntax highlighting**

```ccat [file.py]```

**Display multiple files**

```ccat [file1.go] [file2.js]```

**Output as HTML**

```ccat --html [file.rb]```

**Dark background colors**

```ccat --bg=dark [file.c]```

**Show color palette**

```ccat --palette```

# SYNOPSIS

**ccat** [_options_] _file_...

# DESCRIPTION

**ccat** is a colorizing cat command that displays file contents with syntax highlighting. Supports JavaScript, Java, Go, Ruby, C, Python, JSON, and more. Single binary, native speed.

# PARAMETERS

**--html**
> Output as HTML

**--bg**=_color_
> Background color: light, dark

**-G** _key=color_
> Set custom color codes

**--palette**
> Display color palette

**-C**, **--color**=_mode_
> Color mode: always, never, auto

# SUPPORTED LANGUAGES

- JavaScript / TypeScript
- Python
- Go
- Ruby
- C / C++
- Java
- JSON
- And more via Pygments

# ALIASING

Replace cat with ccat:

```bash
alias cat='ccat'
```

Add to ~/.bashrc for permanent use.

# CAVEATS

Written in Go (owenthereal version) or Python (welbornprod version). Requires terminal with color support.

# SEE ALSO

[cat](/man/cat)(1), [bat](/man/bat)(1), [highlight](/man/highlight)(1)
