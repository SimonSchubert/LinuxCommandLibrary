# TAGLINE

tests Nix package changes by building affected packages

# TLDR

**Review pull request**

```nixpkgs-review pr [12345]```

**Review with local checkout**

```nixpkgs-review rev HEAD```

**Review specific commit**

```nixpkgs-review rev [abc123]```

**Review with post-build report**

```nixpkgs-review pr [12345] --post-result```

**Review allowing unfree packages**

```nixpkgs-review pr [12345] --allow-unfree```

**Review with specified number of cores**

```nixpkgs-review pr [12345] --build-args "-j [4]"```

**List failed builds**

```nixpkgs-review pr [12345] --print-result```

# SYNOPSIS

**nixpkgs-review** [_pr_] [_rev_] [_-p post-result_] [_options_] _target_

# PARAMETERS

**pr** _NUMBER_
> Review pull request by number.

**rev** _COMMIT_
> Review specific revision.

**wip**
> Review work in progress.

**--post-result**, **-p**
> Post results to GitHub.

**--allow-unfree**
> Build unfree packages.

**--build-args** _ARGS_
> Arguments to pass to nix-build.

**--print-result**
> Print build results.

**--no-shell**
> Don't start shell after build.

**-c** _PATH_, **--checkout** _PATH_
> Path to nixpkgs checkout.

**--system** _SYSTEM_
> Target system.

**--token** _TOKEN_
> GitHub token.

# DESCRIPTION

**nixpkgs-review** tests Nix package changes by building affected packages. It's essential for reviewing nixpkgs pull requests.

For pull requests, the tool checks out the PR, identifies changed packages, and builds them. Build failures indicate problems that need fixing before merge.

The review process compares the PR against the target branch. Only packages affected by changes are built, saving time on large contributions.

Post-result mode comments on GitHub PRs with build outcomes. This provides automated feedback to contributors and reviewers.

After builds complete, an interactive shell provides access to built packages for manual testing. Environment variables point to successful builds.

The tool handles unfree packages, cross-compilation targets, and parallel builds through configuration.

# CAVEATS

Builds can take significant time and resources. Requires nix with flakes or nix-build. GitHub rate limits may affect PR fetching. Some packages may not build on all systems.

# HISTORY

**nixpkgs-review** was developed by **Jörg Thalheim** (Mic92) to improve the nixpkgs review process. It automates what was previously a manual process of checking out PRs and building packages, significantly improving review efficiency.

# SEE ALSO

[nix-build](/man/nix-build)(1), [nix-shell](/man/nix-shell)(1), [nixos-rebuild](/man/nixos-rebuild)(1)
