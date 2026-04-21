# TAGLINE

COPR build system client

# TLDR

**Show the authenticated user**

```copr-cli whoami```

**Create a new COPR project**

```copr-cli create [project_name] --chroot [fedora-rawhide-x86_64] --chroot [epel-9-x86_64]```

**Build a package from a local SRPM**

```copr-cli build [project_name] [package.src.rpm]```

**Build from an SRPM URL**

```copr-cli build [project_name] [https://example.com/package.src.rpm]```

**Build from a PyPI package**

```copr-cli buildpypi [project_name] --packagename [requests]```

**Watch an in-progress build**

```copr-cli watch-build [build_id]```

**List your COPR projects**

```copr-cli list```

**Check build status**

```copr-cli status [build_id]```

**Cancel a running build**

```copr-cli cancel [build_id]```

**Download built packages**

```copr-cli download-build [build_id]```

**Delete a project**

```copr-cli delete [project_name]```

# SYNOPSIS

**copr-cli** _command_ [_options_] [_arguments_]

# PARAMETERS

**whoami**
> Print the user authenticated by the configured API token.

**list** [_OWNER_]
> List projects belonging to the current user or the specified owner.

**list-chroots**
> List chroots available on the COPR server.

**create** _NAME_
> Create a new COPR project (requires at least one --chroot).

**modify** _PROJECT_
> Modify settings of an existing project.

**delete** _PROJECT_
> Delete a project.

**build** _PROJECT_ _SRPM_|_URL_
> Submit a build from a local SRPM or an SRPM URL.

**buildpypi** _PROJECT_
> Build from a PyPI source package.

**buildgem** _PROJECT_
> Build from a RubyGems gem.

**buildscm** _PROJECT_
> Build from a remote SCM repository (git/svn).

**build-distgit** _PROJECT_
> Build a package from a DistGit repository.

**status** _BUILD_ID_
> Print the current status of a build.

**watch-build** _BUILD_ID_
> Follow a build until it completes.

**cancel** _BUILD_ID_
> Cancel a running build.

**download-build** _BUILD_ID_ [_DEST_]
> Download the built RPMs for the given build.

**regenerate-repos** _PROJECT_
> Regenerate the repository metadata for a project.

**-r**, **--chroot** _CHROOT_
> Specify the build target (e.g., fedora-rawhide-x86_64, epel-9-x86_64). May be repeated.

**--nowait**
> Submit the build without waiting for it to finish.

**--background**
> Run the build in the background (lower priority than normal builds).

**--after-build-id** _ID_
> Make this build run after the specified build completes (batch dependency).

**--timeout** _SECONDS_
> Override the default build timeout.

**--config** _FILE_
> Use an alternate configuration file (default: ~/.config/copr).

# CONFIGURATION

**~/.config/copr**
> API token configuration for authenticating with the COPR build system.

# DESCRIPTION

**copr-cli** is the command-line client for Fedora's COPR build system. It allows developers to create projects, submit builds, manage repositories, and automate package distribution without using the web interface.

The tool handles the complete package lifecycle: creating projects with specified build targets (chroots), submitting source RPMs for building, monitoring build progress, and downloading the resulting packages. It supports building from local files, URLs, or SCM repositories.

copr-cli is essential for CI/CD pipelines that automatically build and publish packages to COPR. Authentication is handled via API tokens stored in a configuration file, enabling scripted operations.

# CAVEATS

Requires a Fedora Account System (FAS) account and API token configured in **~/.config/copr**. Build chroots must be enabled for the project before building. Large builds may take significant time; use **--nowait** for async operation.

# HISTORY

copr-cli was developed alongside the COPR build service by the Fedora Project. It provides programmatic access to the same functionality available through the COPR web interface at **copr.fedorainfracloud.org**, enabling automation and integration with development workflows.

# SEE ALSO

[copr](/man/copr)(1), [rpmbuild](/man/rpmbuild)(1), [mock](/man/mock)(1), [dnf](/man/dnf)(1)
