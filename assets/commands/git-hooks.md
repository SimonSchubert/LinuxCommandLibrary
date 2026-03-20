# TAGLINE

Scripts triggered at Git workflow points

# TLDR

**Create pre-commit hook**

```echo '#!/bin/sh' > .git/hooks/pre-commit && chmod +x .git/hooks/pre-commit```

**List available hooks**

```ls .git/hooks/*.sample```

**Enable sample hook**

```mv .git/hooks/pre-commit.sample .git/hooks/pre-commit```

# DESCRIPTION

**Git hooks** are scripts that run automatically at key points in the Git workflow. They enable automation of tasks like linting, testing, and commit message validation.

Hooks are stored in **.git/hooks/** and must be executable. Common hooks include pre-commit (before commit), prepare-commit-msg (edit message), commit-msg (validate message), and pre-push (before push).

# HOOK TYPES

**Client-side hooks:**
```
pre-commit         Run before commit
prepare-commit-msg Edit commit message template
commit-msg         Validate commit message
post-commit        After commit completes
pre-rebase         Before rebase starts
post-checkout      After checkout or switch
post-merge         After merge completes
pre-push           Before push
```

**Server-side hooks:**
```
pre-receive        Before accepting push
update             Per-branch pre-receive
post-receive       After push completes
post-update        After all refs updated
```

# CONFIGURATION

**.git/hooks/**
> Default directory containing hook scripts for the repository. Scripts must be executable.

**core.hooksPath**
> Git config variable to override the hooks directory (since Git 2.9). Set with `git config core.hooksPath <path>`.

# CAVEATS

Hooks are not version-controlled in .git/hooks. Use tools like Husky or pre-commit to share hooks. Hooks can be bypassed with --no-verify. Keep hooks fast to avoid workflow friction.

# SEE ALSO

[git](/man/git)(1), [git-commit](/man/git-commit)(1), [husky](/man/husky)(1), [pre-commit](/man/pre-commit)(1)
