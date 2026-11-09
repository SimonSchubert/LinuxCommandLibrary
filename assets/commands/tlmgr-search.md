# TAGLINE

Search TeX Live packages

# TLDR

**Search installed packages by name and description**

```tlmgr search [keyword]```

**Search the repository instead of the local installation**

```tlmgr search --global [keyword]```

**Search files**

```tlmgr search --file [filename]```

**Find which package provides a file, in the repository**

```tlmgr search --global --file [filename.sty]```

**Search names, descriptions and filenames**

```tlmgr search --all [keyword]```

# SYNOPSIS

**tlmgr search** [_options_] _pattern_

# PARAMETERS

**--global**
> Search the database of the repository instead of the local installation.

**--file**
> List all filenames containing the pattern.

**--word**
> Match whole words only, in package names and descriptions but not filenames.

**--all**
> Search everything: package names, descriptions and filenames.

**--json**
> Output results as JSON with the keys files and packages.

# DESCRIPTION

**tlmgr search** finds TeX Live packages by name, description, or contained files. By default it searches names and descriptions of locally installed packages, and the pattern is a Perl regular expression. Part of TeX Live Manager for discovering LaTeX packages.

# SEE ALSO

[tlmgr-info](/man/tlmgr-info)(1), [tlmgr-install](/man/tlmgr-install)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
