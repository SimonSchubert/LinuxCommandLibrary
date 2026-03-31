# TAGLINE

Find alternate files for source and test switching

# TLDR

**Find** alternate file for a source file

```alt [path/to/file.rb]```

**Find** alternate showing only the **top** result

```alt --truncate [1] [path/to/file.rb]```

**Find** alternates including **hidden** files

```alt -a [path/to/file.rb]```

**Find** alternate reading file list from **stdin**

```find . -type f -print | alt -f - [path/to/file.rb]```

# SYNOPSIS

**alt** [_options_] _path_

# DESCRIPTION

**alt** finds the "alternate file" for a given source file, typically switching between implementation and test files. It ranks all files in the project by similarity to the given path and outputs them in ranked order.

For example, given **app/models/user.rb**, it would find **test/models/user_test.rb** or **spec/models/user_spec.rb**. This makes it easy to jump between code and tests in editor integrations such as Vim, NeoVim, and VS Code.

By default, **alt** ignores hidden directory entries, globs defined in a **.ignore** file, and globs defined in the project's **.gitignore** and global **.gitignore**.

# PARAMETERS

**-a**
> Include hidden files and directories in the search.

**-f** _-_
> Read file paths from standard input instead of scanning the directory.

**-t** _N_, **--truncate** _N_
> Truncate output to N alternate files (default 0, meaning show all).

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# CAVEATS

Alternate file matching relies on path similarity ranking based on common naming conventions; unusual project structures may produce unexpected results. By default, all possible alternates are shown in ranked order; use **--truncate 1** to get only the best match.

# HISTORY

**alt** was created by **Drew De Ponte** (uptech) as a fast, editor-independent command-line tool for finding alternate files. Written in Rust, it was originally designed for Vim integration but works with any editor or shell workflow.

# SEE ALSO

[find](/man/find)(1), [fd](/man/fd)(1), [fzf](/man/fzf)(1)
