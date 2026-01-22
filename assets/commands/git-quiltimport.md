# TLDR

**Import quilt patches**

```git quiltimport```

**Import from specific directory**

```git quiltimport --patches [patches/]```

**Dry run**

```git quiltimport -n```

# SYNOPSIS

**git quiltimport** [_options_]

# PARAMETERS

**--patches** _DIR_
> Patches directory.

**--series** _FILE_
> Series file location.

**-n**, **--dry-run**
> Show what would be imported.

**--author** _AUTHOR_
> Default author.

**--help**
> Display help information.

# DESCRIPTION

**git quiltimport** imports a quilt patchset into git. Quilt is a patch management system, and this command converts quilt-managed patches into git commits.

The command reads the patches/ directory and series file, creating commits in order. It enables migration from quilt-based workflows to git.

git quiltimport bridges quilt and git patch management.

# CAVEATS

Requires properly formatted quilt patches. Author info may need specification. One-way import.

# HISTORY

git quiltimport supports migration from **quilt**, a popular patch management tool used before git became widespread, particularly in Linux distribution development.

# SEE ALSO

[git-am](/man/git-am)(1), [quilt](/man/quilt)(1)
