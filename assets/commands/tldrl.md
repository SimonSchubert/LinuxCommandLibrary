# TAGLINE

Alias of tldr-lint, a linter for tldr pages

# TLDR

**Lint a page**

```tldrl [path/to/page.md]```

**Lint all pages in a directory**

```tldrl [path/to/directory]```

**Format a page to stdout**

```tldrl -f [path/to/page.md]```

**Format a page in place**

```tldrl -i [path/to/page.md]```

**Ignore specific error codes**

```tldrl -I [TLDR001,TLDR014] [path/to/page.md]```

# SYNOPSIS

**tldrl** [_options_] _file_|_directory_

# PARAMETERS

**-f**, **--format**
> Also attempt formatting (to stdout, or as specified by **-o**).

**-o**, **--output** _FILE_
> Output to a formatted file.

**-i**, **--in-place**
> Format in place.

**-t**, **--tabular**
> Print errors in a tabular format.

**-v**, **--verbose**
> Print verbose output.

**-I**, **--ignore** _CODES_
> Ignore comma-separated tldr-lint error codes.

**-V**, **--version**
> Display the version.

**-h**, **--help**
> Show help.

# DESCRIPTION

**tldrl** is an alias of **tldr-lint**, a tool for validating pages of the tldr-pages project against its style rules. It reports errors by code and can also reformat pages.

# CAVEATS

Installed through npm as the tldr-lint package, which provides both command names. It checks page files and does not display tldr pages; use a tldr client for that.

# SEE ALSO

[tldr-lint](/man/tldr-lint)(1), [tldr](/man/tldr)(1)

# RESOURCES

```[Source code](https://github.com/tldr-pages/tldr-lint)```

<!-- verified: 2026-11-09 -->
