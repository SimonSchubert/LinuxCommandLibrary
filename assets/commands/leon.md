# TAGLINE

Open-source personal AI assistant that runs on your own server

# TLDR

**Install the Leon CLI globally**

```npm install --global @leon-ai/cli```

**Create a new Leon instance**

```leon create birth```

**Create an instance from the develop branch**

```leon create birth --develop```

**Start Leon**

```leon start```

**Check that the setup is correct**

```leon check```

**View instance information**

```leon info```

# SYNOPSIS

**leon** _command_ [_options_]

# PARAMETERS

**create birth**
> Initialize and set up a new Leon instance with all required dependencies.

**start**
> Start the Leon server and enable interaction.

**check**
> Verify that the setup completed successfully.

**info**
> View details about a Leon instance.

**delete**
> Remove a Leon instance.

**update**
> Update Leon to the latest version.

**run**
> Execute npm scripts within a Leon instance.

**help**
> Display available commands.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**Leon** is an open-source personal AI assistant that runs on your own server. It provides a skills-based architecture where each capability is a modular skill that can be installed, configured, and extended independently.

Leon supports voice interaction and text-based input through its web interface. It runs on Node.js with a Python runtime for skill execution, making it cross-platform across Linux, macOS, and Windows.

The assistant is designed for self-hosting, keeping all data and processing on your own infrastructure. Skills cover categories such as productivity, utilities, and information retrieval. Developers can create custom skills to extend Leon's capabilities. The CLI companion helps with setup and management of Leon instances.

# CAVEATS

Requires Node.js and Python installed on the host system. Voice interaction depends on a microphone and supported speech recognition setup. Some skills may require additional API keys for external service integrations. The initial setup downloads several dependencies and may take time on slower connections.

# HISTORY

Leon was created by **Louis Grenard** and first released in **2019**. The project is hosted at **getleon.ai** and has accumulated over 15,000 GitHub stars. It was designed as a privacy-focused alternative to cloud-based assistants like Alexa and Google Assistant, emphasizing self-hosting and open-source extensibility. Development continues with an active community contributing skills and improvements.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1)
