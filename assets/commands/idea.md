# TAGLINE

command-line launcher for IntelliJ IDEA

# TLDR

**Open project**

```idea [project-directory]```

**Open file**

```idea [file.java]```

**Open at line**

```idea --line [42] [file.java]```

**Compare files**

```idea diff [file1] [file2]```

**Merge files**

```idea merge [local] [remote] [base] [output]```

**Wait for IDE**

```idea --wait [file]```

# SYNOPSIS

**idea** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files or projects to open.

**--line** _NUM_
> Open at line number.

**diff**
> Compare files.

**merge**
> Three-way merge.

**--wait**
> Wait for file close.

**--help**
> Display help information.

# DESCRIPTION

**idea** is the command-line launcher for IntelliJ IDEA. It opens files, projects, and invokes IDE features from the terminal.

The tool supports diff, merge, and project navigation. It integrates with git and other tools requiring an editor.

# CAVEATS

Requires IntelliJ IDEA installed. Path setup needed. Resource intensive.

# HISTORY

idea is the CLI launcher for **JetBrains IntelliJ IDEA**, a popular Java IDE.

# SEE ALSO

[code](/man/code)(1), [vim](/man/vim)(1), [eclipse](/man/eclipse)(1)
