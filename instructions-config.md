Go through every existing command in assets/commands/*.md and do the following tasks. Save finished commands in commands_processed.txt to keep track of the progress.

Task 1:
Add configuration section to commands where it's useful. The pine commands is good example for a good configuration section. Vim command for example has the configuration information inside the description section, move it out of description into configuration. It's important that the configuration section structure is consistent between all command detail pages.

Task 2:
The description section content for example for mail, nano and ngrep is not well readable. Commands with good description content examples are: tcpdump, 2fa, adb, bfgminer

Task 3:
Add a new section to the top of the markdown file called "TAGLINE". the tagline should be a few word description of the command. the tagline should not include the command name itself but describe it. for example:

# TAGLINE

modular multi-threaded Bitcoin miner
