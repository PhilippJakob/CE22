# DB Tables for the Room-Booking Software
> This is the documentation for the different database tables used in the Program
> The tables shall be saved in this folder as .sql files to be imported on any device

<br/>

### Account Table

###### Structure
<table>
    <tr>
        <th>Account</th><td>id</td><td>type</td><td>username</td><td>password</td><td>fistname</td><td>lastname</td><td>class</td>
    </tr>
</table>

###### Usage
    - This table is used to store the accounts
    - IMPORTANT is the hashing of the passwords

<br/>

### Group Table

###### Structure
<table>
    <tr>
        <th>Group</th><td>id</td><td>type</td><td>owner</td><td>name</td><td>subject</td><td>additionalInfo</td><td>additionalData</td>
    </tr>
</table>

###### Usage
    - References between Accounts and Users done in a-g
    - additional* fields are optional