# TAGLINE

runs stop, restart, and start scripts

# TLDR

**Restart application**

```npm restart```

# SYNOPSIS

**npm** **restart** [_args_...]

# DESCRIPTION

**npm restart** runs the lifecycle hooks **prerestart**, **restart**, and **postrestart** in order. If no **restart** script is defined in **package.json**, it falls back to running **stop** followed by **start** (so the package's own **start** and **stop** scripts execute). This is the conventional way to bounce a long-running Node process described by **package.json scripts** without rewriting the command in your shell.

# CAVEATS

Unlike a process supervisor (pm2, systemd), **npm restart** does not background the new process or persist it across shell exits — it simply runs the **start** script in the foreground. For production process management use a real supervisor.

# INSTALL

```pacman: sudo pacman -S npm```

```apk: sudo apk add npm```

```brew: brew install npm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[npm](/man/npm)(1), [npm-start](/man/npm-start)(1), [npm-stop](/man/npm-stop)(1)

