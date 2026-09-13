# TAGLINE

Unpack objects from a packed Git archive

# TLDR

**Unpack** a packfile into loose objects (reads stdin)

```git unpack-objects < [path/to/file.pack]```

**Dry-run**: check the pack without writing objects

```git unpack-objects -n < [path/to/file.pack]```

**Quiet**: suppress the percentage progress meter

```git unpack-objects -q < [path/to/file.pack]```

Keep going after **corruption** and recover as many objects as possible

```git unpack-objects -r < [path/to/file.pack]```

Refuse to write objects with **broken content or links**

```git unpack-objects --strict < [path/to/file.pack]```

Abort if the pack is **larger than a size limit**

```git unpack-objects --max-input-size=[size] < [path/to/file.pack]```

# SYNOPSIS

**git** **unpack-objects** [**-n**] [**-q**] [**-r**] [**--strict**] [**--max-input-size=**_size_]

# PARAMETERS

**-n**
> Dry run. Check the pack file without actually unpacking the objects.

**-q**
> Suppress the percentage progress meter the command normally prints.

**-r**
> When unpacking a corrupt packfile, keep going instead of dying at the first corruption and recover as many objects as possible.

**--strict**
> Do not write objects with broken content or links.

**--max-input-size=**_size_
> Die if the pack is larger than _size_.

# DESCRIPTION

**git unpack-objects** is a low-level plumbing command. It reads a packed archive (**.pack**) from standard input, expands the objects inside it, and writes them into the repository in loose form (one object per file under **.git/objects**).

Objects that already exist in the repository are **not** unpacked from the packfile. Running this command on a pack that already lives in the target repository therefore unpacks nothing.

Typical uses are recovering objects from a pack copied out of another repository, or feeding a pack produced by **git pack-objects**. Everyday packing and cleanup is done with **git repack** and **git gc**; this command is the inverse of packing, not a substitute for those tools.

# CAVEATS

The pack is read from **stdin**, not from a filename argument. You must run it inside a Git repository. Existing objects are skipped, so a pack already registered in the target repo is a no-op. **--strict** still requires a well-formed pack; it only refuses to persist broken objects.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-09-13 -->

# SEE ALSO

[git-repack](/man/git-repack)(1), [git-verify-pack](/man/git-verify-pack)(1), [git-cat-file](/man/git-cat-file)(1), [git-gc](/man/git-gc)(1), [git-unpack-file](/man/git-unpack-file)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-unpack-objects)```

```[Source code](https://github.com/git/git)```

<!-- verified: 2026-09-13 -->
