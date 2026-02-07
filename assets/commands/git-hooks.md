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
prepare-commit-msg Edit commit message
commit-msg         Validate commit message
post-commit        After commit completes
pre-push           Before push
```

**Server-side hooks:**
```
pre-receive        Before accepting push
update             Per-branch pre-receive
post-receive       After push completes
```

# CONFIGURATION

**.git/hooks/**
> Directory containing hook scripts for the repository. Must be executable.

# CAVEATS

Hooks are not version-controlled in .git/hooks. Use tools like Husky or pre-commit to share hooks. Hooks can be bypassed with --no-verify. Keep hooks fast to avoid workflow friction.

# SEE ALSO

[git](/man/git)(1), [githooks](/man/githooks)(5), [husky](/man/husky)(1), [pre-commit](/man/pre-commit)(1)
