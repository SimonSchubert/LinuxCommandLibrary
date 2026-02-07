# TAGLINE

Node.js commit message validator

# TLDR

**Validate a commit message**

```core-validate-commit [commit_sha]```

**Validate with specific rules**

```core-validate-commit --rules [rules.json] [commit_sha]```

# SYNOPSIS

**core-validate-commit** [_options_] [_commit_]

# DESCRIPTION

**core-validate-commit** is a specialized tool developed for the Node.js project to enforce commit message conventions. It validates that commit messages follow the project's specific format requirements, which include proper subsystem prefixes, grammatical rules, and metadata formatting.

The Node.js project uses a structured commit message format where each commit must start with a subsystem identifier (like "doc:", "test:", "src:") followed by a concise description. This tool parses commit messages and validates them against these rules, checking for issues like missing subsystems, improper capitalization, trailing periods, and incorrect line lengths.

The tool is primarily used in automated CI/CD pipelines to ensure that all commits landing in the Node.js repository follow project conventions. This consistency makes it easier to generate changelogs, track changes by subsystem, and maintain project history. While specific to Node.js core development, the tool demonstrates the value of automated commit message validation for large projects.

# SEE ALSO

[git](/man/git)(1), [commitlint](/man/commitlint)(1)
