# TAGLINE

Transform and move code between Git repositories

# TLDR

**Run a migration** defined in a Copybara config file

```copybara migrate [copy.bara.sky]```

**Validate** a Copybara config without applying changes

```copybara validate [copy.bara.sky]```

**Show** workflow and origin/destination details from a config

```copybara info [copy.bara.sky]```

**Regenerate** a change that failed to apply cleanly

```copybara regenerate [copy.bara.sky] [workflow] [change-id]```

# SYNOPSIS

**copybara** [_subcommand_] [_options_] _config-file_ [_workflow_] [_source-ref_]

# PARAMETERS

**migrate**
> Apply the configured workflow: fetch changes from the origin, run transformations, and push to the destination. This is the default subcommand when none is given.

**validate**
> Parse and check a config file for errors without touching repositories.

**info**
> Print metadata about workflows, origins, destinations, and last migrated revisions.

**regenerate**
> Re-run a migration for a specific change, useful after merge conflicts or failed applies.

**--force**
> Proceed even when safety checks would normally stop the run.

**--init-history**
> Bootstrap migration history on the destination for a new workflow.

**--dry-run**
> Execute transformations locally without pushing to the destination.

# DESCRIPTION

**copybara** is a tool for **transforming and moving source code between repositories**. It is used to keep a public mirror in sync with an internal codebase, import upstream changes into a fork, or perform one-time code moves with path rewrites, metadata scrubbing, and author mapping.

Workflows are defined in **Starlark** config files (commonly named **copy.bara.sky**). Each workflow specifies an **origin** (where changes are read), a **destination** (where they are written), file filters, and a list of **transformations** such as **core.move**, **core.replace**, and **core.remove**. Copybara is **stateless**: migration progress is stored in the destination repository as labels in commit messages, so multiple users can run the same workflow safely.

The tool supports **Git** as the primary VCS, with experimental **Mercurial** read support. Origins and destinations can target GitHub, Gerrit, local paths, HTTP endpoints, and other pluggable backends. Common patterns include squash-mode public mirroring, cherry-picking contributor PRs into an authoritative repo, and automated subtree imports.

# CAVEATS

Copybara requires **Java 21+** when using official release JARs. Config errors often surface only at runtime against real repositories; run **validate** before large migrations. Transformations are powerful but easy to get subtly wrong — test on disposable clones first. Mercurial and some destination types remain experimental.

# HISTORY

Developed internally at **Google** to manage synchronized public and private codebases, then open-sourced. It replaced ad-hoc mirroring scripts with a declarative, reviewable Starlark configuration model used widely inside Google and by external projects mirroring code to GitHub.

# SEE ALSO

[git](/man/git)(1), [git-filter-repo](/man/git-filter-repo)(1), [repo](/man/repo)(1)

# RESOURCES

```[Source code](https://github.com/google/copybara)```

```[Documentation](https://github.com/google/copybara/blob/master/docs/reference.md)```

<!-- verified: 2026-07-01 -->