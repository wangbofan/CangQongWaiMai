        // 检查用户名是否已存在
        Employee existingEmployee = employeeMapper.getByUsername(employee.getUsername());
        if (existingEmployee != null) {
            throw new RuntimeException("用户名 '" + employee.getUsername() + "' 已经存在，请更换一个。");
        }

        employee.setStatus(StatusConstant.ENABLE);