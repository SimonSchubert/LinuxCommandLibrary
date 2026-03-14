# TAGLINE

Create a GitHub Pages orphan branch

# TLDR

**Create a gh-pages branch**

```git gh-pages```

# SYNOPSIS

**git** **gh-pages**

# DESCRIPTION

**git gh-pages** creates and sets up a **gh-pages** branch for GitHub Pages hosting. This is a **git-extras** command that automates the creation of an orphan branch with an empty history, suitable for hosting static websites independent of the main project history.

The command creates the orphan branch, removes all tracked files, and makes an initial empty commit. After creation, the gh-pages branch can be populated with HTML, CSS, and JavaScript files. When pushed to GitHub, the repository content becomes accessible as a website at **https://username.github.io/repository**.

# CAVEATS

Requires the **git-extras** package to be installed. The command switches the working directory to the new gh-pages branch. Modern GitHub Pages can also deploy from a subdirectory (e.g., /docs) on the main branch or via GitHub Actions, making the orphan branch approach less common than it once was.

# SEE ALSO

[git-fresh-branch](/man/git-fresh-branch)(1), [git-extras](/man/git-extras)(1), [git-checkout](/man/git-checkout)(1), [git-branch](/man/git-branch)(1)
