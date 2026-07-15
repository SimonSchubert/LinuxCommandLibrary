# TAGLINE

exchange files with an EuroBraille Clio terminal

# TLDR

**Start** the interactive file transfer session

```eutp```

# SYNOPSIS

**eutp**

# DESCRIPTION

**eutp** lets you exchange files with a Clio terminal from EuroBraille. It is part of the **brltty** braille display driver package.

The program is fully interactive and menu driven: it prompts you to choose the transfer direction (send files to the terminal or receive files from it), the file type, and the files to transfer. There are no command-line options.

When receiving files, be careful with shell special characters. Wildcards such as **\*** and **.** are interpreted by the terminal's file matching, so protect them with single quotes or backslashes to avoid unexpected results.

# PARAMETERS

_None._
> eutp takes no command-line options; all interaction happens through its menus.

# CAVEATS

Requires an EuroBraille Clio terminal connected to the system. Returns 1 on error. Special characters in file names should be quoted to prevent shell or terminal expansion.

# SEE ALSO

[brltty](/man/brltty)(1)

# RESOURCES

```[Source code](https://github.com/brltty/brltty)```

```[Homepage](https://brltty.app/)```

<!-- verified: 2026-07-15 -->
