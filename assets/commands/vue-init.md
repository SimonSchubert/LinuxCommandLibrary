# TAGLINE

Create Vue.js projects from templates

# TLDR

**Create a project from** the webpack template

```vue init webpack [project-name]```

**Create a project from** the simple template (no build step)

```vue init simple [project-name]```

**Create from a local template** directory

```vue init [~/my-template] [project-name]```

**Create from a GitHub repository** template

```vue init [username/repo] [project-name]```

**Clone instead of downloading** the template

```vue init --clone [username/repo] [project-name]```

**Use a cached template** (offline mode)

```vue init --offline [webpack] [project-name]```

# SYNOPSIS

**vue** **init** [_options_] _template_ _project-name_

# PARAMETERS

_template_
> Template name. Built-in templates include webpack, webpack-simple, browserify, browserify-simple, pwa, and simple. Can also be a GitHub repo (user/repo) or local path.

_project-name_
> Name for the new project directory.

**--clone**
> Use git clone instead of downloading a zip archive.

**--offline**
> Use a previously cached template instead of downloading.

# DESCRIPTION

**vue init** creates new Vue.js projects from templates. This is a legacy command from **Vue CLI 2.x** (package: **vue-cli**). For **Vue CLI 3+** (package: **@vue/cli**), use **vue create** instead.

The command is still useful for custom project templates hosted on GitHub or stored locally. To use it with Vue CLI 3+, install the **@vue/cli-init** bridge package.

# CAVEATS

This is a Vue CLI 2.x command. Vue CLI 3+ uses **vue create** for new projects. The built-in templates (webpack, browserify, etc.) are no longer maintained. To use **vue init** with **@vue/cli** 3+, install **@vue/cli-init** globally.

# SEE ALSO

[vue](/man/vue)(1)
