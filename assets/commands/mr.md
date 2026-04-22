# TAGLINE

myrepos — run version-control commands across many repositories at once

# TLDR

**Update every registered repo**

```mr update```

**Check the status of every repo**

```mr status```

**Commit changes** across all repos with the same message

```mr commit -m "[message]"```

**Register the current repo** in `~/.mrconfig`

```mr register```

**Run an arbitrary command** inside every repo

```mr run [git fetch]```

**Run only on a repo in the current directory subtree**

```mr -d [.] status```

**List configured repositories**

```mr list```

**Bootstrap a new checkout from a shared `.mrconfig`**

```mr checkout```

**Use a non-default config file**

```mr -c [/path/to/mrconfig] update```

**Run sequentially** (disable default parallel jobs)

```mr -s update```

# SYNOPSIS

**mr** [_options_] _command_ [_command args_]

# PARAMETERS

**-c** _CONFIG_
> Use _CONFIG_ instead of `$HOME/.mrconfig`.

**-d** _DIR_
> Operate only on the repository at _DIR_ (or the closest enclosing one).

**-t** _SECONDS_
> Timeout each sub-command after _SECONDS_.

**-j** _N_
> Run _N_ jobs in parallel (default 1, `-j0` = unlimited).

**-s**
> Stop on first error (also serialize when using `-j`).

**-i**
> Interactive: prompt before each action.

**-n**
> Limit recursion: only act on repos whose path is under the current directory.

**-p** _DIR_
> Chdir to _DIR_ before running.

**-f**
> Force action even on repos that are marked `skip`.

**-v**
> Verbose.

**-q**
> Quiet: suppress standard output from mr and its children.

**-m**
> Commit message (for `commit`).

**--version**
> Show version.

**--help**
> Show help.

# COMMON COMMANDS

**checkout** — clone every repo listed in the config.
**update** — `git pull --rebase` / `svn update` / `hg pull -u` / etc., per-repo.
**status** — show working-tree status for each repo.
**commit** — commit (use `-m` to set a message).
**push** / **pull** / **fetch** — VCS-specific wrappers.
**diff** / **log** — per-repo diff or log.
**run** _CMD_ — run _CMD_ in each repo directory.
**register** [_DIR_] — add a repo (default: current) to the config.
**list** — show repos that would be acted on.
**config** [_REPO_] [_KEY_ [_VALUE_]] — read/write config keys.
**bootstrap** _URL_ — fetch an `.mrconfig` from a URL and run `checkout`.
**online** / **offline** — mark repos as reachable/unreachable for later `--online-only` runs.
**help** — show help for a specific command.

# CONFIGURATION

**~/.mrconfig** (primary) and any `.mrconfig` in the current tree.

Sections are per-repo; the `[DEFAULT]` section holds defaults. Commands are defined as shell blocks:

```
[src/vim]
checkout = git clone git@github.com:you/vim .
update = git pull --rebase
skip = [ "$1" = "fetch" ] && ! mr_any_args
```

Supported backends out of the box: git, subversion, mercurial, bazaar, cvs, darcs, fossil, veracity, git-svn, unison. Custom backends can be added by writing matching actions.

# DESCRIPTION

**mr** (myrepos) orchestrates version-control operations across a heterogeneous collection of repositories. It reads per-repo action definitions from one or more `.mrconfig` files and runs them, so a single `mr update` can pull dozens of git repos, an svn checkout, and a mercurial clone in one go. Parallel execution (`-j`), timeouts (`-t`), and per-repo `skip` rules make it practical on large fleets.

# CAVEATS

Requires Perl. Parallel mode interleaves output; use `-j1` (the default) when you need clean logs. `mr commit` only commits already-staged (or tracked, depending on VCS) changes — it does not add new files.

# HISTORY

**mr** / **myrepos** was created by **Joey Hess** and is now maintained by **Richard Hartmann** (RichiH). It has been packaged in Debian since the late 2000s and is the spiritual ancestor of tools like `vcsh` and `gita`.

# SEE ALSO

[git](/man/git)(1), [vcsh](/man/vcsh)(1), [gita](/man/gita)(1)
