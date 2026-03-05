# TAGLINE

Syntax-aware Git merge conflict resolver

# TLDR

**Use as a Git merge driver** (configure in .gitattributes)

```*.rs merge=mergiraf```

**Resolve conflicts** in a file manually

```mergiraf resolve [path/to/conflicted_file]```

# SYNOPSIS

**mergiraf** _command_ [_options_] [_file_]

# DESCRIPTION

**mergiraf** is a syntax-aware Git merge driver that resolves merge conflicts by parsing the syntax tree of code and structured files. It supports many languages including TypeScript, Python, Java, Rust, JSON, and YAML.

It operates as a drop-in driver for **git merge**, **git rebase**, and **cherry-pick**, but can also be run manually after a conflict. When it cannot safely auto-merge, it leaves clear conflict markers for manual review.

# CAVEATS

Cannot resolve all conflicts — semantic conflicts that require understanding program logic still need manual resolution. Language support varies by file type.

# HISTORY

**mergiraf** was created by **Antonin Delpeuch** and is written in **Rust**. The source is hosted on Codeberg.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-mergetool](/man/git-mergetool)(1)
