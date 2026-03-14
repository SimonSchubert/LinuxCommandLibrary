# TAGLINE

Syntax-aware Git merge conflict resolver

# TLDR

**Register mergiraf as a Git merge driver**

```mergiraf register```

**Use as a Git merge driver** (configure in .gitattributes)

```*.rs merge=mergiraf```

**Resolve conflicts** in a file manually

```mergiraf resolve [path/to/conflicted_file]```

**Resolve with explicit language** specification

```mergiraf resolve -L [rust] [path/to/conflicted_file]```

**Review mergiraf's automatic resolution**

```mergiraf review [path/to/file]```

**List supported languages**

```mergiraf languages```

# SYNOPSIS

**mergiraf** _command_ [_options_] [_file_]

# SUBCOMMANDS

**resolve**
> Attempt to resolve merge conflicts in a file.

**review**
> Review mergiraf's automatic conflict resolution.

**register**
> Register mergiraf as a Git merge driver in global git config.

**languages**
> List supported languages and file extensions.

**report**
> Generate an archive to reproduce a faulty merge.

# PARAMETERS

**-L, --language** _LANG_
> Specify language by name or file extension.

# DESCRIPTION

**mergiraf** is a syntax-aware Git merge driver that resolves merge conflicts by parsing the syntax tree of code and structured files. It supports many languages including TypeScript, Python, Java, Rust, JSON, and YAML.

It operates as a drop-in driver for **git merge**, **git rebase**, and **cherry-pick**, but can also be run manually after a conflict. When it cannot safely auto-merge, it leaves clear conflict markers for manual review.

# CAVEATS

Cannot resolve all conflicts — semantic conflicts that require understanding program logic still need manual resolution. Language support varies by file type. For best results, use Git v2.44.0 or newer.

# HISTORY

**mergiraf** was created by **Antonin Delpeuch** and is written in **Rust**. The source is hosted on Codeberg.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-mergetool](/man/git-mergetool)(1)
