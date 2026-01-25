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

# EXAMPLE HOOKS

```bash
# .git/hooks/pre-commit
#!/bin/sh
npm run lint || exit 1
npm test || exit 1

# .git/hooks/commit-msg
#!/bin/sh
grep -qE "^(feat|fix|docs|style|refactor|test|chore):" "$1" || {
  echo "Commit message must follow convention"
  exit 1
}
```

# CAVEATS

Hooks are not version-controlled in .git/hooks. Use tools like Husky or pre-commit to share hooks. Hooks can be bypassed with --no-verify. Keep hooks fast to avoid workflow friction.

# SEE ALSO

[git](/man/git)(1), [githooks](/man/githooks)(5), [husky](/man/husky)(1), [pre-commit](/man/pre-commit)(1)
