# TAGLINE

Automate versioning and package publishing

# TLDR

**Run semantic-release** in the current project

```npx semantic-release```

**Run with a specific version**

```npx semantic-release@[25]```

**Perform a dry run** to preview the release without publishing

```npx semantic-release --dry-run```

**Run with additional plugins**

```npx --package semantic-release --package @semantic-release/exec semantic-release```

**Run with specific branches** configuration

```npx semantic-release --branches [main]```

**Run ignoring CI** environment detection

```npx semantic-release --no-ci```

**Specify the repository URL**

```npx semantic-release --repository-url [https://github.com/user/repo.git]```

# SYNOPSIS

**semantic-release** [_options_]

**npx semantic-release** [_options_]

# PARAMETERS

**-d**, **--dry-run**
> Run in dry-run mode to preview the pending release without actually publishing. Skips prepare, publish, addChannel, success, and fail steps. Prints the next version and release notes to console.

**--no-ci**
> Run semantic-release in a local environment outside of CI. Useful for testing and debugging.

**-b**, **--branches**
> Define the branches on which releases should happen. Accepts branch names or micromatch glob patterns.

**-p**, **--plugins**
> Define the list of plugins to use.

**-r**, **--repository-url**
> The git repository URL.

**-t**, **--tag-format**
> The Git tag format used to identify releases. Default: **v${version}**.

**-e**, **--extends**
> Shareable configuration to extend.

**--debug**
> Enable debug output.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**semantic-release** automates the entire package release workflow including version determination, changelog generation, and package publishing. It analyzes commits since the last release using conventional commit messages to determine the next semantic version number automatically.

The tool follows the Semantic Versioning specification: fix commits trigger patch releases, feat commits trigger minor releases, and commits with BREAKING CHANGE trigger major releases. It integrates with npm, GitHub, GitLab, and other platforms through a plugin system.

Configuration can be provided via **package.json**, **.releaserc** file, **release.config.js**, or CLI arguments. By default, it releases from **main** or **master** branches, with support for pre-release channels (alpha, beta) and maintenance branches.

# CONFIGURATION

**.releaserc**
> Project-level configuration file (JSON or YAML) specifying branches, plugins, and release options.

**release.config.js**
> JavaScript configuration file alternative for programmatic release configuration.

**package.json** (release key)
> Configuration can also be embedded under the "release" key in package.json.

**GH_TOKEN** / **GITHUB_TOKEN**
> GitHub authentication token for creating releases and commenting on issues.

**NPM_TOKEN**
> npm authentication token for publishing packages to the registry.

# CAVEATS

semantic-release must run in a CI environment with push access to the repository and publish access to the package registry. The dry-run mode still verifies repository push permissions. Commits must follow conventional commit format for automatic version detection. Plugin options cannot be set via CLI and must be configured in the configuration file.

# HISTORY

**semantic-release** was created by Stephan Boennemann and first released in **2015** to solve the problem of manual, error-prone software releases. It pioneered the concept of fully automated releases based on commit message conventions. The project gained significant adoption in the JavaScript/Node.js ecosystem and influenced similar tools in other languages. It continues active development under the semantic-release organization on GitHub.

# SEE ALSO

[npm](/man/npm)(1), [git](/man/git)(1), [conventional-changelog](/man/conventional-changelog)(1)
