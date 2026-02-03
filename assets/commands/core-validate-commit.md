# TLDR

**Validate a commit message**

```core-validate-commit [commit_sha]```

**Validate with specific rules**

```core-validate-commit --rules [rules.json] [commit_sha]```

# SYNOPSIS

**core-validate-commit** [_options_] [_commit_]

# DESCRIPTION

**core-validate-commit** validates Git commit messages against Node.js core contribution guidelines. It checks that commit messages follow the conventional format required by the Node.js project.

Used in Node.js CI/CD pipelines to ensure consistent commit message formatting.

# SEE ALSO

[git](/man/git)(1), [commitlint](/man/commitlint)(1)
