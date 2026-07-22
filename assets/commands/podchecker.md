# TAGLINE

Validate Perl POD documentation syntax

# TLDR

**Check POD syntax**

```podchecker [file.pod]```

**Check multiple files**

```podchecker [*.pod]```

**Warnings only**

```podchecker -warnings [file.pod]```

# SYNOPSIS

**podchecker** [_options_] [_files_]

# PARAMETERS

_FILES_
> POD files to check.

**-warnings**
> Show warnings. May be specified more than once to increase the warning level (up to **-warnings -warnings**).

**-nowarnings**
> Suppress warnings (default is to show warnings).

**-help**
> Print usage message and exit.

**-man**
> Print the manual page and exit.

# DESCRIPTION

**podchecker** validates the syntax of Perl POD (Plain Old Documentation) files, reporting errors such as unknown formatting codes, mismatched begin/end blocks, and malformed headings.

It checks for both hard errors that would cause incorrect rendering and warnings about questionable constructs. Use **-warnings** to control the level of warning output. Part of the standard Perl distribution.

# CAVEATS

Perl-specific format. Standard Perl utility.

# HISTORY

podchecker was created for **validating POD** documentation syntax.

# INSTALL

```apt: sudo apt install perl```

```dnf: sudo dnf install perl```

```pacman: sudo pacman -S perl```

```apk: sudo apk add perl```

```zypper: sudo zypper install perl```

```brew: brew install perl```

```nix: nix profile install nixpkgs#perl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pod2man](/man/pod2man)(1), [pod2html](/man/pod2html)(1), [pod2text](/man/pod2text)(1), [podselect](/man/podselect)(1), [perldoc](/man/perldoc)(1)

