# TAGLINE

fast and powerful Git hooks manager written in Go

# TLDR

**Install git hooks**

```lefthook install```

**Add hook configuration**

```lefthook add pre-commit```

**Run hooks manually**

```lefthook run pre-commit```

**Uninstall hooks**

```lefthook uninstall```

**Generate sample config**

```lefthook dump```

# SYNOPSIS

**lefthook** _command_ [_options_]

# PARAMETERS

**install**
> Install lefthook git hooks.

**uninstall**
> Remove lefthook git hooks.

**add** _hook_
> Add configuration for a hook.

**run** _hook_
> Run a hook manually.

**dump**
> Print merged configuration.

**version**
> Show version information.

# DESCRIPTION

**lefthook** is a fast and powerful Git hooks manager written in Go. It allows running multiple commands in parallel, supports any language for scripts, and provides flexible configuration through YAML files.

lefthook is designed to be fast, using parallel execution and smart skipping to minimize hook runtime.

# CONFIGURATION

```yaml
# lefthook.yml
pre-commit:
  parallel: true
  commands:
    lint:
      run: npm run lint
    test:
      run: npm test
```

# CAVEATS

Requires lefthook.yml in project root. Hooks must be installed after cloning. Parallel execution may cause output interleaving.

# HISTORY

lefthook was created by **Evil Martians** as a fast, polyglot alternative to husky and pre-commit, first released in **2019**.

# SEE ALSO

[git](/man/git)(1), [husky](/man/husky)(1), [pre-commit](/man/pre-commit)(1)
