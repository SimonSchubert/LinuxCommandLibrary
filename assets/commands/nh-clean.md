# TAGLINE

removes old Nix profile generations and runs garbage collection

# TLDR

**Clean** all profiles and garbage-collect the store

```nh clean all```

Clean only the **current user's** profiles

```nh clean user```

Keep at least the **last 5 generations** and anything from the past week

```nh clean all --keep [5] --keep-since [7d]```

**Preview** what would be removed

```nh clean all --dry```

**Ask for confirmation** before deleting

```nh clean all --ask```

Clean a **specific profile**

```nh clean profile [/nix/var/nix/profiles/system]```

Remove generations but **skip garbage collection**

```nh clean user --no-gc```

Run **store optimisation** after garbage collection

```nh clean all --optimise```

# SYNOPSIS

**nh clean** **all**|**user** [_options_]

**nh clean profile** [_options_] _profile_

# PARAMETERS

**all**
> Clean all profiles: system profiles, per-user profiles and every user's XDG profiles. Usually needs root, which nh obtains itself.

**user**
> Clean the current user's profiles (~/.local/state/nix/profiles and /nix/var/nix/profiles/per-user/_user_). Refuses to run as root.

**profile** _path_
> Clean one specific profile. Gcroots are not touched in this mode.

**-k**, **--keep** _n_
> Keep at least this number of generations. Default: 1.

**-K**, **--keep-since** _duration_
> Keep gcroots and generations newer than this duration (humantime format, e.g. 3d, 2weeks, 12h). Default: 0h.

**-n**, **--dry**
> Only print what would be done, without doing it.

**-a**, **--ask**
> Ask for confirmation before proceeding.

**--no-gc**
> Don't run nix store gc after removing generations.

**--no-gcroots**
> Don't clean gcroots.

**--no-direnv**
> Don't clean gcroots created by direnv / nix-direnv.

**--keep-one**
> Keep at least one gcroot per direnv project.

**--optimise**
> Run nix-store --optimise after garbage collection.

**--max** _size_
> Pass --max to nix store gc, stopping after freeing this many bytes.

**-x**, **--cross-filesystems**
> Cross filesystem boundaries when scanning for gcroots.

# DESCRIPTION

**nh clean** is a more thorough replacement for **nix-collect-garbage**. It deletes old generations of Nix profiles according to count and age rules, removes orphaned gcroots and aged-out direnv gcroots, then runs **nix store gc** to free space in the Nix store.

Unlike nix-collect-garbage, it can keep a minimum number of generations and a time window at the same time, and shows a plan of what it will delete before acting.

# CAVEATS

**--keep** takes a number of generations, not a duration; use **--keep-since** for time-based retention. Both rules are applied together: a generation is kept if either rule keeps it. The currently active generation is never removed.

On NixOS, **programs.nh.clean.enable** can run nh clean periodically; do not enable it together with **nix.gc.automatic**.

# INSTALL

```nix: nix profile install nixpkgs#nh```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nh](/man/nh)(1), [nix-collect-garbage](/man/nix-collect-garbage)(1), [nix-store](/man/nix-store)(1), [direnv](/man/direnv)(1)

# RESOURCES

```[Source code](https://github.com/nix-community/nh)```

<!-- verified: 2026-09-29 -->
