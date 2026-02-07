# TAGLINE

Pack loose objects into pack files

# TLDR

**Repack objects**

```git repack```

**Repack aggressively**

```git repack -a -d```

**Repack with delta compression**

```git repack -a -d --depth=[250] --window=[250]```

**Repack all objects**

```git repack -A -d```

**Repack with geometry**

```git repack --geometric=[2]```

# SYNOPSIS

**git** **repack** [_options_]

# PARAMETERS

**-a**
> Pack all objects.

**-A**
> Pack all reachable objects.

**-d**
> Remove redundant packs.

**-f**
> Force delta recomputation.

**--depth** _n_
> Delta chain depth.

**--window** _n_
> Delta window size.

**--geometric** _factor_
> Geometric repacking.

**-l**
> Local objects only.

# DESCRIPTION

**git repack** consolidates loose objects into pack files, improving storage efficiency and access time. It reorganizes the repository's object database by combining individual loose objects into compressed packs.

Repacking is useful after many small commits or after importing objects. The `-a -d` combination is common for aggressive repacking that removes redundant packs.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-prune-packed](/man/git-prune-packed)(1)
