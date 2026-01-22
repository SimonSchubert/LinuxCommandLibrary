# TLDR

**Run merge tool**

```git mergetool```

**Use specific tool**

```git mergetool --tool=[vimdiff]```

**Resolve specific file**

```git mergetool [file.txt]```

**Don't prompt**

```git mergetool --no-prompt```

**Use configured tool**

```git mergetool -y```

# SYNOPSIS

**git mergetool** [_options_] [_file_]

# PARAMETERS

_FILE_
> Specific file to resolve.

**--tool** _TOOL_
> Use specified merge tool.

**--tool-help**
> List available tools.

**-y**, **--no-prompt**
> Don't prompt before each file.

**--prompt**
> Prompt before each file.

**--help**
> Display help information.

# DESCRIPTION

**git mergetool** runs a merge conflict resolution tool. It launches configured tools like vimdiff, meld, or kdiff3 on each conflicted file, providing visual three-way merge interfaces.

The tool shows base, local, and remote versions side by side. After saving the merged result, the file is marked as resolved. Multiple files are processed sequentially.

git mergetool provides visual conflict resolution.

# CAVEATS

Requires configured merge tool. Creates .orig backup files. Some tools need installation.

# HISTORY

git mergetool is a core **Git** command providing integration with external merge tools, essential for complex conflict resolution.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-difftool](/man/git-difftool)(1), [vimdiff](/man/vimdiff)(1)
