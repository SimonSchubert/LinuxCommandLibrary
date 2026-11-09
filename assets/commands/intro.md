# TAGLINE

Introduction to user commands (man page section 1)

# TLDR

**Read the introduction to user commands**

```man intro```

**Read the introduction for a specific section**

```man [1] intro```

**Read every intro page** in turn

```man -a intro```

**List all intro pages** with their sections

```man -f intro```

# SYNOPSIS

**man** [_section_] **intro**

# DESCRIPTION

**intro** is an introductory man page present in each section of the manual. Section 1 describes user commands and tools, including file manipulation tools, shells, compilers, web browsers, editors, and other programs that users commonly invoke from the command line.

Each manual section has its own intro page providing an overview of the section's scope:

- **1** - User commands and programs
- **2** - System calls (kernel interfaces)
- **3** - Library functions (C library routines)
- **4** - Special files (devices in /dev)
- **5** - File formats and conventions
- **6** - Games and screensavers
- **7** - Miscellaneous (protocols, conventions, character sets)
- **8** - System administration commands

# CAVEATS

A manual page only, not an executable command. Content varies by distribution. Part of the **man-pages** package on Linux.

# HISTORY

intro pages have been part of **Unix documentation** since the earliest versions, providing orientation for each manual section. The convention of numbered sections dates back to the original **Unix Programmer's Manual** from **1971**.

# SEE ALSO

[man](/man/man)(1), [apropos](/man/apropos)(1), [whatis](/man/whatis)(1), [manpath](/man/manpath)(1)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/docs/man-pages/man-pages.git)```

```[Homepage](https://www.kernel.org/doc/man-pages/)```

```[Documentation](https://man7.org/linux/man-pages/man1/intro.1.html)```

<!-- verified: 2026-11-09 -->
