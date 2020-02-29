# DataStructuresAlgorithms
Data Structures and Algorithms Deep Dive Using Java Ude Course

Create idea project called data-structures-algorithms inside DataStructuresAlgorithm.

$ git init

https://gist.github.com/nepsilon/156387acf9e1e72d48fa35c4fabef0b4

ngocpt22: $ git clone https://github.com/ngochatake/DataStructuresAlgorithms.git

$ git pull origin master
Error: Please commit your changes or stash them before you merge. Aborting
https://stackoverflow.com/questions/15745045/how-do-i-resolve-git-saying-commit-your-changes-or-stash-them-before-you-can-me
One solution
$ git checkout filename
To discard the change and the file will be replaced by committed local = reverted back to local history
Then run $ git pull origin master

! [rejected]        master -> master (non-fast-forward)
$ git pull origin master
to get latest source from origin master. Refer to: https://stackoverflow.com/questions/2883840/differences-between-git-pull-origin-master-git-pull-origin-master
This case, because the changes in README.rd is newest, but not in my local. !!!Find the different!!!
