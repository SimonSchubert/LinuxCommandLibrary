# TAGLINE

Go source code formatter

# TLDR

**Format a Go file** and print to stdout

```gofmt [file.go]```

**Format and overwrite** the original file

```gofmt -w [file.go]```

**Format all Go files** in a directory recursively

```gofmt -w [path/to/directory]```

**Show diff of formatting** changes

```gofmt -d [file.go]```

**List files that would be** modified

```gofmt -l [path/to/directory]```

**Simplify code** in addition to formatting

```gofmt -s [file.go]```

**Format and simplify** in place

```gofmt -s -w [file.go]```

# SYNOPSIS

**gofmt** [_FLAGS_] [_PATH_...]

# PARAMETERS

**-w**
> Write result to source file instead of stdout.

**-d**
> Display diffs instead of rewriting files.

**-l**
> List files whose formatting differs from gofmt's.

**-s**
> Simplify code (apply simplification rules).

**-e**
> Report all errors (not just first 10 per file).

**-r** _RULE_
> Apply rewrite rule (e.g., 'a[b:len(a)] -> a[b:]').

**-cpuprofile** _FILE_
> Write CPU profile to file.

# DESCRIPTION

**gofmt** formats Go source code according to standard Go style guidelines. It uses tabs for indentation and blanks for alignment, ensuring consistent formatting across all Go codebases.

When invoked without paths, it reads from standard input. With file or directory arguments, it processes those paths recursively. The **-s** flag applies simplification transformations like removing unnecessary type declarations. The **-r** flag enables custom rewrite rules for code transformations.

# CAVEATS

gofmt enforces Go's official style with no configuration options for style preferences like brace placement or tab width. Files must be syntactically valid Go code. For import organization, use **goimports** instead, which also handles imports.

# HISTORY

gofmt was created as part of the Go programming language, first released by Google in **2009**. The decision to include an official formatter with no style options was intentional, eliminating debates about code style in Go projects. This "one true style" approach has been widely adopted and influenced other languages to create similar tools (rustfmt, prettier, black).

# SEE ALSO

[goimports](/man/goimports)(1), [go](/man/go)(1), [golint](/man/golint)(1), [staticcheck](/man/staticcheck)(1)
