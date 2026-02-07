# TAGLINE

Visual conflict resolution tool

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

**git mergetool** runs a visual merge conflict resolution tool for each conflicted file. It launches configured tools like vimdiff, meld, or kdiff3, providing a three-way merge interface showing the base, local, and remote versions side by side.

After saving the merged result in the tool, the file is marked as resolved. Multiple conflicted files are processed sequentially, and you can choose to skip individual files.

# CONFIGURATION

**~/.gitconfig**
> Configure default merge tool and tool-specific settings.

```
[merge]
    tool = vimdiff
[mergetool]
    prompt = false
    keepBackup = false
```

# CAVEATS

Requires configured merge tool. Creates .orig backup files. Some tools need installation.

# HISTORY

git mergetool is a core **Git** command providing integration with external merge tools, essential for complex conflict resolution.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-difftool](/man/git-difftool)(1), [vimdiff](/man/vimdiff)(1)
