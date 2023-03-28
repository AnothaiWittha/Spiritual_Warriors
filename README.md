# Spiritual_Warriors
Artsper website automation testing

Please follow steps below to setup this project

## **Step1: Clone the repository**

git clone <git_url>

## **Step2: Create your own branch**

Before run this command, you will need to be on main branch.

git branch

git branch <branch_name>

## **Step3: Switch to your branch**

#either
git checkout <branch_name>
#or
git switch <branch_name>
Tip: Or combine Step2 & Step3 with git switch -C <branch_name> or git checkout -b <branch_name>

## **Step4: Import the project**

Open your IDE, then import the recent cloned project.
**For IntelliJ user, if you still don't see /src folder you may need to create a project module like so


## **Step5: Check your current branch**

Open the cloned project, and make sure that you are checked out to your new branch before start the work. (you will not work on main)

To check your current branch: (if you don't have zsh or bash)

git branch

## **********After you done with your work and you want to push or change**

to check status or any modify or any updates

git status 

to add your work file to see change or any update

git add .
or add single file
git add <file_name1>
or add multiple files. separate file names with a space 
git add <file_name1> <file_name2>
Then commit all files in Staging Area:

git commit -m "this message should be meaningful"

to push your work to github

## **Push you code to remote repository**

use either one of the command below to push it to github.com
For command line, using sequence of Git commands below

If you never have origin <branch_name> branch (on GitHub)

    Optional:

To check existing origin branch

git branch -a
it will show list of local branches & origin branches

    To check that your local branch is track with origin branch

    git branch -vv

    branch -vv screenshot

To publish the branch for the first time.

this will set you <branch_name> to track with origin/<branch_name>
and push local <branch_name> to origin branch
git push -u origin <branch_name>

Else if your local branch has already tracked to your origin/.. branch
To push you change to the existing remote branch:

git push origin <branch_name>

    Note: you can check that your local branch has tracked remote branch or not by using

    git branch -vv
    
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://img.freepik.com/premium-vector/funny-dinosaur-work-hard-office-with-computer_7130-1510.jpg?w=740)
