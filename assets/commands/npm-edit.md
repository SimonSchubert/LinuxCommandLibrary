# TLDR

**Edit installed package**

```npm edit [package]```

**Edit with specific editor**

```EDITOR=vim npm edit [package]```

# SYNOPSIS

**npm edit** _pkg_

# PARAMETERS

**pkg**
> Package name to edit.

# DESCRIPTION

**npm edit** opens an installed package's directory in the default editor. This allows direct modification of package code for debugging or local patches.

The editor is determined by the EDITOR environment variable.

# EXAMPLE

```bash
# Edit lodash package
npm edit lodash
# Opens in $EDITOR at node_modules/lodash

# Use specific editor
EDITOR=code npm edit express
```

# USE CASES

```
- Debug package issues
- Apply local patches
- Inspect package internals
- Test modifications
```

# CAVEATS

Changes lost on npm install/update. Use patch-package for persistent patches. Editing in node_modules is generally discouraged.

# ALTERNATIVES

```bash
# Use patch-package for persistent changes
npx patch-package package-name

# Or fork the package
git clone https://github.com/user/package
```

# HISTORY

npm edit has been part of npm since early versions, providing quick access to edit installed dependencies.

# SEE ALSO

[npm](/man/npm)(1), [npm-explore](/man/npm-explore)(1), [patch-package](/man/patch-package)(1)
